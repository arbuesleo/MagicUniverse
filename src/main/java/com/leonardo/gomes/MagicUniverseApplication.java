package com.leonardo.gomes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MagicUniverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicUniverseApplication.class, args);
	}
	
	 @Bean
	    public EmbeddedServletContainerCustomizer containerCustomizer() {
	        return (container -> {
	            container.setPort(8012);
	        });
	    }
}
