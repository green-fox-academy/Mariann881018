package com.example.demo.controllers;

import com.example.demo.models.Fox;
import com.example.demo.services.FoxListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  private FoxListService foxListService;

  @GetMapping("/")
  public String home(Model model, @RequestParam(defaultValue = "Mr. Fox") String name) {
    model.addAttribute("fox", new Fox(name));
      return "index";
  }

  @GetMapping("/index")
  public String index(@RequestParam(required = false) String name, Model model) {
    if(name == null) {
      return "login";
    } else {
      model.addAttribute("fox", foxListService.findByName(name));
      return "index";
    }
  }

  @PostMapping("/login")
  public String login(String name) {
    Fox fox = new Fox(name);
    foxListService.addFox(fox);
    return "redirect:/index?name=" + name;
  }

  @GetMapping("/login")
  public String getLoginPage(@RequestParam(required = false) String name) {
    return "login";
  }
}