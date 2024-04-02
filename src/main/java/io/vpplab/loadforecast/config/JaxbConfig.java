package io.vpplab.loadforecast.config;

import io.vpplab.loadforecast.client.LoadForecastClientInterceptor;
import io.vpplab.loadforecast.client.LoadForecastClientServiceDev;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

@Controller
@RequiredArgsConstructor
public class JaxbConfig {

    private final LoadForecastClientServiceDev loadForecastClientServiceDev;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("io.vpplab.kpx.loadforecast.prod");
        return marshaller;
    }

    @Primary
    @Bean(name = "marshalClearingService")
    public LoadForecastClientServiceDev marshalClearingService(Jaxb2Marshaller marshaller) {
        loadForecastClientServiceDev.setDefaultUri("http://services.kmos.kr/test/loadforecast");
        loadForecastClientServiceDev.setMarshaller(marshaller);
        loadForecastClientServiceDev.setUnmarshaller(marshaller);
        loadForecastClientServiceDev.setInterceptors(new ClientInterceptor[]{new LoadForecastClientInterceptor()});
        return loadForecastClientServiceDev;
    }
}
