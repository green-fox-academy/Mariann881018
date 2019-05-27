package com.example.demo.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
  List<String> listOfFoods;

  public FoodService(){
    listOfFoods = new ArrayList<>();
    listOfFoods.add("Burger");
    listOfFoods.add("Pizza");
    listOfFoods.add("Gyros");
    listOfFoods.add("Salad");
  }

  public List<String> getListOfFoods() {
    return listOfFoods;
  }

}
