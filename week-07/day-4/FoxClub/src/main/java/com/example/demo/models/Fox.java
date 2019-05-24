package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> trickList;

  @Autowired
  private Drink drink;
  private Food food;

  public Fox(){
  }

  public Fox(String name) {
    this.name = name;
    drink = new Drink("Coca Cola");
    food = new Food("Burger");
    trickList = new ArrayList<>();
  }

  public boolean hasAnyTricks(){
    return trickList.size() != 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Food getFood() {
    return food;
  }

  public void setFood(Food food) {
    this.food = food;
  }

  public Drink getDrink() {
    return drink;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }

  public List<String> getTrickList() {
    return trickList;
  }
}
