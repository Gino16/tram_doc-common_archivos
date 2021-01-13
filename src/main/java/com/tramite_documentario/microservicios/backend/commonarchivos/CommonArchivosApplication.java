package com.tramite_documentario.microservicios.backend.commonarchivos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class CommonArchivosApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonArchivosApplication.class, args);
    }

}
