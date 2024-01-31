package ru.cft.shift.springdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloWorldService {
  private final String messageHello;

//  private final DemoService demoService;

  public HelloWorldService(
          @Value("${app.messageHello:Hello world}")
          String messageHello
//          , DemoService demoService
  ) {
    this.messageHello = messageHello;
//    this.demoService = demoService;
  }

  public void sayHello() {
    log.info(messageHello);
  }

  public String getMessageHello() {
    return messageHello;
  }
}
