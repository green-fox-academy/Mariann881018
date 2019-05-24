package com.example.demo.controllers;

import com.example.demo.models.Fox;
import com.example.demo.services.DrinkService;
import com.example.demo.services.FoodService;
import com.example.demo.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {

  @Autowired
  private FoxService foxService;

  @Autowired
  private FoodService foodService;

  @Autowired
  private DrinkService drinkService;

  @GetMapping("/nutritionStore")
  public String getNutriStore(@RequestParam String name, Model model){
    if (name == null) {
      return "login";
    } else {
      model.addAttribute("fox",foxService.findByName(name));
      model.addAttribute("food",foodService.getListOfFoods());
      model.addAttribute("drink", drinkService.getListOfDrinks());
      return "nutritionStore";
    }
  }

  @PostMapping("/nutritionStore")
  public String saveFood(@RequestParam(required = false)String name,@ModelAttribute String food, @ModelAttribute String drink) {
    foxService.findByName(name).getFood().setFoodName(food);
    foxService.findByName(name).getDrink().setDrinkName(drink);
    return "redirect:/index?name=" + name;
  }

  @GetMapping("/trickCenter")
  public String getTrickCenter(){
    return "trickCenter";
  }

  @PostMapping("/trickCenter")
  public String saveTrick(Model model, @ModelAttribute("foxTrick") Fox fox, @RequestParam(required = false) String name) {
    return "redirect:/index?name=" + name;
  }

}
