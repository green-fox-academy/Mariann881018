package com.example.demo.controllers;

import com.example.demo.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FoxController {
  private List<Fox> foxList;
  private Fox fox;

  @GetMapping("/nutritionStore")
  public String getNutriStore(){
    return "nutritionStore";
  }

  @PostMapping("/nutritionStore")
  public String saveFood(Model model, @RequestParam String food, @RequestParam String drink) {
/*    model.addAttribute("food", fox.getFood().getFoodName());*/
/*    model.addAttribute("drink", fox.getDrink().setName(drink));*/
    return "redirect:/index";
  }

  @GetMapping("/trickCenter")
  public String getTrickCenter(){
    return "trickCenter";
  }

  @PostMapping("/trickCenter")
  public String changeTrick(String name) {
    return "redirect:/index?name=" + name;
  }
}
