package ru.cft.shift.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.cft.shift.springdemo.service.HelloWorldService;

@Controller
public class HomeController {

  public HelloWorldService helloWorldService;

  public HomeController() {

  }

  @Autowired
  public HomeController(HelloWorldService helloWorldService) {
    this.helloWorldService = helloWorldService;
  }

//  @GetMapping("/")
//  public String hello() {
//    return "hello";
//  }

  @GetMapping("/greeting")
  public String greeting(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {

    model.addAttribute("name", helloWorldService.getMessageHello());
    return "greeting";
  }
}
