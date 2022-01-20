package com.jobsity.bowlingscore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.jobsity.bowlingscore.AppConfig;

@SpringBootTest

@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
class BowlingScoreApplicationTests {

	@Test
	void contextLoads() {
	}

}
