package com.example.jenkinsproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsProjectApplicationTests {

	
	
	public static org.slf4j.Logger logger=LoggerFactory.getLogger(JenkinsProjectApplication.class);
	
	@Test
	void contextLoads() {
		
		logger.info("testing excute");
		assertEquals(true, false);
	}

}
