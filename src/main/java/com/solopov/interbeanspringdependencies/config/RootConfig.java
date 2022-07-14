package com.solopov.interbeanspringdependencies.config;

import com.solopov.interbeanspringdependencies.service.ExternalService;
import com.solopov.interbeanspringdependencies.service.RentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@Component - will return "false" in the MyApp
public class RootConfig {

    @Bean
    public ExternalService externalService(){
        return new ExternalService();
    }

    @Bean
    public RentService rentService(){
        return new RentService(externalService());
    }

}
