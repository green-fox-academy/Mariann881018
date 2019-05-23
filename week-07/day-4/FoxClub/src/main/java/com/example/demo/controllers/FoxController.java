package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoxController {

  @GetMapping("/nutritionStore")
  public String nutrition(){
    return "nutritionStore";
  }

  @PostMapping("/nutritionStore")
  public String login(String name) {
    return "redirect:/index?name=" + name;
  }
}


//create a /nutritionStore route
//create the nutrition store view's template
//do not forget to add this to the menu on the other views
//here you should be able to change the fox's food and drink
//feel free to add your own foods and drinks
//you might need additional routes to achieve this
//create an other controller for those (eg. FoxController.class)
//when the button is pressed it should redirect to the information page
//optional: the current food and drink are selected by default