package com.example.demo.models;

import com.example.demo.services.TrickService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private ArrayList<String> listOfTricks = new ArrayList<>();

  @Autowired
  private Drink drink;
  private Food food;
  private Trick trick;
  private TrickService trickService;

  public Fox(){
  }

  public Fox(String name) {
    this.name = name;
    drink = new Drink("Coca Cola");
    food = new Food("Burger");
  }
  public boolean hasAnyTricks(){
    return listOfTricks.size() != 0;
  }

  public int numberOfTricks(){
    if (listOfTricks != null){
      return listOfTricks.size();
    } else
    return 0;
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

  public Trick getTrick() {
    return trick;
  }

  public void setTrick(Trick trick) {
    this.trick = trick;
  }

  public List<String> getTrickList() {
    return listOfTricks;
  }

  public void setTrickList(List<String> trickList) {
    this.listOfTricks = listOfTricks;
  }

  public void addTrick(String trick) {
    this.listOfTricks.add(trick);
  }
}
