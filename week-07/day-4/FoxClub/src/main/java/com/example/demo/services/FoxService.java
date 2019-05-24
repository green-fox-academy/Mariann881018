package com.example.demo.services;

import com.example.demo.models.Food;
import com.example.demo.models.Fox;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
  private List<Fox> foxList;
  private List<Food> foodList;

  public FoxService() {
    foxList = new ArrayList<>();
  }

  public void addFox(Fox fox){
    foxList.add(fox);
  }

  public Fox findByName(String name) {
    for (Fox fox : foxList) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }
    return null;
  }

  public void addFood(Food food){
    foodList.add(food);
  }

}
