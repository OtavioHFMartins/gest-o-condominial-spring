package com.gestao_condominial.gestao_condominial.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
  public ObjectMapper objectMapper(){
      return new ObjectMapper();
  }
}
