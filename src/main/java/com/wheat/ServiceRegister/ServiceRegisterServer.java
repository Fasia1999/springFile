package com.wheat.ServiceRegister;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegisterServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "service-register-server");
        new SpringApplicationBuilder(ServiceRegisterServer.class).run(args);
    }
}
