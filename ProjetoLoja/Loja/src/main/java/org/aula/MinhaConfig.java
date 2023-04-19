package org.aula;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfig {
    @Bean(name = "appName")
    public String applicationName(){
        return "String sendo vinculado ao @Bean appName";
    }

    @Bean(name = "appID")
    public String applicationId(){
        return "Id = 1234";
    }
}
