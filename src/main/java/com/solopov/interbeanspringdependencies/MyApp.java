package com.solopov.interbeanspringdependencies;

import com.solopov.interbeanspringdependencies.config.RootConfig;
import com.solopov.interbeanspringdependencies.service.ExternalService;
import com.solopov.interbeanspringdependencies.service.RentService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        ExternalService externalService = context.getBean(ExternalService.class);
        RentService rentService = context.getBean(RentService.class);

        //uncomment the @Component in the RootConfig to get opposite result (spoiler: must be "false")
        System.out.println("Result of comparison of Inter-bean dependencies:"
                + rentService.getExternalService().equals(externalService));

    }

}
