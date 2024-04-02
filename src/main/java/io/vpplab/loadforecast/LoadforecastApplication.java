package io.vpplab.loadforecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = "io.vpplab")
public class LoadforecastApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadforecastApplication.class, args);
	}

}
