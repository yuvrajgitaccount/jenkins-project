package com.example.jenkinsproject;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {

	
	public static org.slf4j.Logger logger=LoggerFactory.getLogger(JenkinsProjectApplication.class);
	
	
	
	public void dbint()
	{
		logger.info("it is intilize");
	}
	
	public static void main(String[] args) {
		
		logger.info("excuteion point");
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

}
