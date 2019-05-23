package com.example.demo.controllers;

import com.example.demo.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
  private List<Fox> foxList;
  private Fox fox;

  @GetMapping("/index")
  public String index(@RequestParam(required = false) String name, Model model) {
    if(name == null) {         // goes to /index
      return "login";
    } else {                  // goes to /index?name=Alex
      model.addAttribute("fox", new Fox(name));
      return "index";
    }
  }

  @PostMapping("/login")
  public String login(String name) {
    return "redirect:/index?name=" + name;
  }
}
