package com.oms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class OmsApplication {

	private static Logger logger = LoggerFactory.getLogger(OmsApplication.class);

	public static void main(String[] args) {
		logger.info("啟動開始");
		SpringApplication.run(OmsApplication.class, args);
		logger.info("啟動結束");
	}
}
