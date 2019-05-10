package com.boot.config;

import com.boot.config.properties.MultipleMongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableConfigurationProperties(MultipleMongoProperties.class)
@EnableMongoRepositories(basePackages = "com.boot.repository.secondary",mongoTemplateRef = "secondaryMongoTemplate")
public class SecondMongoConfig {
}
