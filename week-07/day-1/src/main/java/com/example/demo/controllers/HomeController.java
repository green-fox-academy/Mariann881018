package com.example.demo.controllers;

import com.example.demo.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

  @GetMapping("/home")
  public String index(Model model){
    return "index";
  }

  @ModelAttribute
  public void setup(Model model){
    Person p = new Person("Alex", 23);
    model.addAttribute("person",p);
  }
}
