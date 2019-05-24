package com.example.demo.controllers;

import com.example.demo.models.Fox;
import com.example.demo.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  private FoxService foxService;

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
      model.addAttribute("fox", foxService.findByName(name));
      return "index";
    }
  }

  @GetMapping("/login")
  public String getLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String loginReceived(String name) {
    Fox fox = new Fox(name);
    foxService.addFox(fox);
    return "redirect:/index?name=" + name;
  }
}