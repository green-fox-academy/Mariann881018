package com.example.demo.services;

import com.example.demo.models.Fox;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoxListService {
  private List<Fox> foxList;

  public FoxListService() {
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

}
