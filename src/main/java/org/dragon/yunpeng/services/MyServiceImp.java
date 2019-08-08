package org.dragon.yunpeng.services;

import org.apache.log4j.Logger;

public class MyServiceImp implements MyService {

  private static final Logger logger = Logger.getLogger(MyServiceImp.class);

  @Override
  public void executeService() {
    System.out.println("MyService Executed.");
    logger.info("MyService Executed.");
  }
  
}
