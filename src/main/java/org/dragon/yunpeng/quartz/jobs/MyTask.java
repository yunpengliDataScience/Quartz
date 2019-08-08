package org.dragon.yunpeng.quartz.jobs;

import org.apache.log4j.Logger;
import org.dragon.yunpeng.services.MyService;

public class MyTask {

  private static final Logger logger = Logger.getLogger(MyTask.class);
  private MyService myService;

  public void executeTask() {

    myService.executeService();
  }

  public MyService getMyService() {
    return myService;
  }

  public void setMyService(MyService myService) {
    this.myService = myService;
  }

}
