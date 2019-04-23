package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

import org.springframework.stereotype.Component;

@Component("daemonJob")
public class DaemonJob implements Callable<Integer> {
	
	boolean isInterrupt = false;
	
	public Integer call() throws Exception {
		
		while(!isInterrupt) {
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			System.out.println("execute "+Thread.currentThread().getName()+" thread at "+timeStamp);
			try {
				Thread.sleep(5000);
			} catch(Exception exp) {
				
			}
			executeJob();
		}
		return null;
	}
	
	public void executeJob() {
		preJob();
		runJob();
		postJob();
	}
	
	public void preJob() {
		
	}

	public void runJob() {
	
	}

	public void postJob() {
	
	}

}
