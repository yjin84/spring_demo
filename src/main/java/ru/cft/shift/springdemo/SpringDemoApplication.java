package ru.cft.shift.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.cft.shift.springdemo.service.DemoService;
import ru.cft.shift.springdemo.service.HelloWorldService;

//@ComponentScan
public class SpringDemoApplication {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringDemoApplication.class);

    DemoService demoService = (DemoService) context.getBean("demoService");
    demoService.demo();
  }
}
