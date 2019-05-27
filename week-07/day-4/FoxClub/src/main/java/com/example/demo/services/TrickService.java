package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrickService {
    ArrayList<String> trickList;

    public TrickService(){
        trickList = new ArrayList<>();
        trickList.add("SQL");
        trickList.add("Java");
        trickList.add("HTML");
        trickList.add("Javascript");
        trickList.add("Spring Master");
    }

    public List<String> getTrickList() {
        return trickList;
    }

    public int numberOfTricks(){
        return trickList.size();
    }

    public void addTrick(String trick) {
        this.trickList.add(trick);
    }

}
