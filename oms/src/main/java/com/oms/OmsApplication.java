package com.oms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@EnableAutoConfiguration
public class OmsApplication {

	private static Logger logger = LoggerFactory.getLogger(OmsApplication.class);

	public static void main(String[] args) {
		logger.info("啟動開始");
		SpringApplication.run(OmsApplication.class, args);
		logger.info("啟動結束");
	}
}
