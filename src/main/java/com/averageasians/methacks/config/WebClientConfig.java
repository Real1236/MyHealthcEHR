package com.averageasians.methacks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    public final String BASE_URL = "https://api.cohere.ai/v1/";

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(BASE_URL)
                .defaultHeaders(header -> {
                    header.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
                    header.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
                    header.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "POST, GET, OPTIONS");
                    header.add(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "Content-Type");
                })
                .build();
    }
}
