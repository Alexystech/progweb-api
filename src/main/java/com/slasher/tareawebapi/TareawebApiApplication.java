package com.slasher.tareawebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TareawebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TareawebApiApplication.class, args);
    }

    /**
     * Configuración para desactivar los CORS para permitir conectar este
     * backend con el frontend desarrollado con Angular el cual se
     * despliega en localhost por el puerto 4200.
     *
     * @return WebMvcConfigurer
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:4200/")
                        .allowedMethods("*")
                        .allowedHeaders("*");
            }
        };
    }

}
