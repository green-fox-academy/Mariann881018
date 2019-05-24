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
      model.addAttribute("fox", new Fox(name));
      return "redirect:/index?name=" + name;
    }
  }

  @PostMapping("/index")
  public String index2(Model model, @ModelAttribute Fox fox) {
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping("/login")
  public String getLoginPage(@RequestParam(required = false) String name) {
    return "login";
  }

  @PostMapping("/login")
  public String saveFox(Model model, @ModelAttribute Fox fox, String name) {
    model.addAttribute("name",fox.getName());
    return "redirect:/index?name=" + name;
  }
}