package ru.cft.shift.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.shift.springdemo.model.Person;

@Controller
@RequestMapping("/person")
public class PersonController {

//  @GetMapping
//  public String person(Model model) {
//    Person person = new Person();
//    person.setName("John");
//    person.setAge(25);
//
//    model.addAttribute(person);
//
//    return "person";
//  }

  @GetMapping
//  @ResponseBody
  public Object person() {
    Person person = new Person();
    person.setName("John");
    person.setAge(25);

    return person;
  }
}
