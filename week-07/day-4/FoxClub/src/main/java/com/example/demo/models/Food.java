package com.example.demo.models;

import org.springframework.stereotype.Service;

@Service
public class Food {
  private String foodName;

  public Food(){
  }

  public Food(String foodName) {
    this.foodName = foodName;
  }

  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }

  @Override
  public String toString() {
    return foodName;
  }
}
