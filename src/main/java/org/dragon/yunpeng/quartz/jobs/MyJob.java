package org.dragon.yunpeng.quartz.jobs;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job {

	private static final Logger logger = Logger.getLogger(MyJob.class);
	@Override
	public void execute(JobExecutionContext ctx) throws JobExecutionException {

		System.out.println("Executing MyJob......");
		logger.info("Executing MyJob......");
	}

}