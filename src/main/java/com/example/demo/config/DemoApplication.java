package com.example.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.example")//TODO: how to decide package name? use universal name
@SpringBootApplication
@MapperScan("com.example.demo.mapper")//扫描 mapper
public class DemoApplication {

	private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOG.info("set up successful");
		LOG.info("address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
