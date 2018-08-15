package com.nsprice.restws;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.northamerica.NAGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@SpringBootApplication
@EnableScheduling
public class RestwsApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RestwsApplication.class, args);

    }
}
