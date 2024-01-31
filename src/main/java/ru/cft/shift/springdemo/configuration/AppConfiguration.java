package ru.cft.shift.springdemo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import ru.cft.shift.springdemo.service.DemoService;
import ru.cft.shift.springdemo.service.HelloWorldService;

//@Configuration
//@Import(SomeConfiguration.class)
//@PropertySource("classpath:application.properties")
public class AppConfiguration {

//  @Bean
//  public HelloWorldService helloWorldService(
//          @Value("${app.messageHello:Hello world}") String messageHello
////          , DemoService demoService
//  ) {
//    return new HelloWorldService(
//            messageHello
////            , demoService
//    );
//  }
}
