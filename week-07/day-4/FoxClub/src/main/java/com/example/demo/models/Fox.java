package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private Food food;
  private Drink drink;
  private List<Trick> trickList = new ArrayList<>();

  public Fox(String name) {
    this.name = name;
    food = new Food("Burger");
    drink = new Drink("Coca Cola");
    trickList.add(new Trick("SQL"));
    trickList.add(new Trick("C#"));
    trickList.add(new Trick("JavaScript"));
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

  public List<Trick> getTrickList() {
    return trickList;
  }
}
