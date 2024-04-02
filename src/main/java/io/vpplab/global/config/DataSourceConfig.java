package io.vpplab.global.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.vpplab.external.client.datahub.DatahubDto;
import io.vpplab.external.client.vpf.VPFDto;
import io.vpplab.global.config.props.DataSourceProps;
import io.vpplab.global.config.props.DatahubDataSourceProps;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Slf4j
@Configuration
@RequiredArgsConstructor
@EnableTransactionManagement
@MapperScans({
    @MapperScan(basePackages = "io.vpplab.external.client.datahub", sqlSessionFactoryRef = "dhSqlSessionFactory")
    , @MapperScan(basePackages = "io.vpplab.external.client.vpf", sqlSessionFactoryRef = "sqlSessionFactory")
})
public class DataSourceConfig {
    private final DataSourceProps dataSourceProps;
    private final DatahubDataSourceProps dhDataSourceProps;

    @Primary
    @Bean(name = "datasource")
    public DataSource dataSource() {
        return this.buildDataSource();
    }

    @Bean(name = "dhDatasource")
    public DataSource dhDataSource() {
        return this.buildDatahubDataSource();
    }

    @Primary
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:static/mybatis/*.xml"));
        sqlSessionFactoryBean.setConfigurationProperties(mybatisConfigProperties());
        sqlSessionFactoryBean.setTypeAliases(setTypeAliases());
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "dhSqlSessionFactory")
    public SqlSessionFactory dhSqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dhDataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:static/mybatis/*.xml"));
        sqlSessionFactoryBean.setConfigurationProperties(mybatisConfigProperties());
        sqlSessionFactoryBean.setTypeAliases(setTypeAliases());
        return sqlSessionFactoryBean.getObject();
    }

    @Primary
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean(name = "dhTransactionManager")
    public PlatformTransactionManager dhTransactionManager() {
        return new DataSourceTransactionManager(dhDataSource());
    }

    private DataSource buildDataSource() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(dataSourceProps.getDriverClassName());
        config.setJdbcUrl(dataSourceProps.getUrl());
        config.setUsername(dataSourceProps.getUsername());
        config.setPassword(dataSourceProps.getPassword());

        DataSourceProps.Hikari hikari = dataSourceProps.getHikari();
        config.setMaximumPoolSize(hikari.getMaximumPoolSize());
        config.setAutoCommit(hikari.getAutoCommit());
        config.setConnectionTestQuery(hikari.getConnectionInitTestQuery());

        log.info("datasource info = {}", dataSourceProps);
        return new HikariDataSource(config);
    }

    private DataSource buildDatahubDataSource() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(dhDataSourceProps.getDriverClassName());
        config.setJdbcUrl(dhDataSourceProps.getUrl());
        config.setUsername(dhDataSourceProps.getUsername());
        config.setPassword(dhDataSourceProps.getPassword());

        DatahubDataSourceProps.Hikari hikari = dhDataSourceProps.getHikari();
        config.setMaximumPoolSize(hikari.getMaximumPoolSize());
        config.setAutoCommit(hikari.getAutoCommit());
        config.setConnectionTestQuery(hikari.getConnectionInitTestQuery());

        log.info("datahub datasource info = {}", dhDataSourceProps);
        return new HikariDataSource(config);
    }

    private Properties mybatisConfigProperties() {
        Properties mybatisProps = new Properties();
        mybatisProps.put("jdbcTypeForNull", JdbcType.NULL);
        mybatisProps.put("callSettersOnNulls", true);
        mybatisProps.put("returnInstanceForEmptyRow", true);
        return mybatisProps;
    }

    private Class<?>[] setTypeAliases(){
        List<Class<?>> classList = new ArrayList<>();

        Class<?>[] datahubDto = DatahubDto.class.getClasses();
        Class<?>[] vpfDto = VPFDto.class.getClasses();

        classList.addAll(List.of(datahubDto));
        classList.addAll(List.of(vpfDto));

        return classList.toArray(new Class[]{Class.class});
    }
}
