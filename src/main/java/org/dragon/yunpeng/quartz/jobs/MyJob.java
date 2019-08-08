package org.dragon.yunpeng.quartz.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyJob extends QuartzJobBean {
  private MyTask myTask;

  public void setMyTask(MyTask myTask) {
    this.myTask = myTask;
  }

  @Override
  protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
    myTask.executeTask();
  }

}
