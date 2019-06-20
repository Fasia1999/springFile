package com.wheat.NameNode;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class NameNode {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "namenode-server");
		new SpringApplicationBuilder(NameNode.class).run(args);
	}

}
