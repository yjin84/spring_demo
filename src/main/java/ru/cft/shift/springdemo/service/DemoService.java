package ru.cft.shift.springdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class DemoService implements InitializingBean {

//  @Autowired
  private HelloWorldService helloWorldService;

  public DemoService(HelloWorldService helloWorldService) {
    this.helloWorldService = helloWorldService;
  }

//  @Autowired
//  public void setHelloWorldService(HelloWorldService helloWorldService) {
//    this.helloWorldService = helloWorldService;
//  }

  public void demo() {
    helloWorldService.sayHello();
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    log.info("DemoService constructed ");
  }
}
