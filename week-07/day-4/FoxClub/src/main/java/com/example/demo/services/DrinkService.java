package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DrinkService {
  List<String> listOfDrinks;

  public DrinkService(){
    listOfDrinks = new ArrayList<>();
    listOfDrinks.add("Coca Cola");
    listOfDrinks.add("Water");
    listOfDrinks.add("Beer");
    listOfDrinks.add("Lemonade");
  }

  public List<String> getListOfDrinks() {
    return listOfDrinks;
  }

  public void setListOfDrinks(List<String> listOfDrinks) {
    this.listOfDrinks = listOfDrinks;
  }
}
