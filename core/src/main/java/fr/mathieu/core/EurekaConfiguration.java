package fr.mathieu.core;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration;

@EnableEurekaClient
public class EurekaConfiguration {
    public EurekaConfiguration() {
        System.out.println("Eureka v12");
    }
}
