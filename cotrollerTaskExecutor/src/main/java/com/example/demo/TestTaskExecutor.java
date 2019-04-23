package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class TestTaskExecutor {
	
	public static void main(String args[]) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfig.class);
		ThreadPoolTaskExecutor executor = (ThreadPoolTaskExecutor)applicationContext.getBean("taskExecutor");
		for(int i=1 ; i < 5 ; i++) {
			DaemonJob job = new DaemonJob();
			executor.submit(job);
		}
	}

}
