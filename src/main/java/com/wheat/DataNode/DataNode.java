package com.wheat.DataNode;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class DataNode {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "datanode-server");
        new SpringApplicationBuilder(com.wheat.DataNode.DataNode.class).run(args);
    }

}
