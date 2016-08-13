package com.achen.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ServiceConfiguration {

    @Bean
    DataSource dataSource(){}

}
