package com.example.demo.controllers;

import com.example.demo.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {

  @GetMapping("/nutritionStore")
  public String getNutriStore(){
    return "nutritionStore";
  }

  @PostMapping("/nutritionStore")
  public String saveFood(Model model, @ModelAttribute("foxFood") Fox fox) {
    model.addAttribute("newFood", fox.getFood());
    model.addAttribute("newDrink", fox.getDrink());
    return "redirect:/index";
  }

  @GetMapping("/trickCenter")
  public String getTrickCenter(){
    return "trickCenter";
  }

  @PostMapping("/trickCenter")
  public String saveTrick(Model model, @ModelAttribute("foxTrick") Fox fox) {
    return "redirect:/index";
  }

  //  @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
  //    public String submit(@ModelAttribute("employee") Employee employee, BindingResult result, ModelMap model) {
  //        model.addAttribute("name", employee.getName());
  //        model.addAttribute("id", employee.getId());
  //        employeeMap.put(employee.getId(), employee);
  //        return "employeeView";
  //    }

}
