package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController{

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam String name) {
    model.addAttribute("name", name);
    return "greeting";
  }
}

// output:
// Hello, World! (It is a web page.)
// http://localhost:8080/web/greeting?name=Your%20name

