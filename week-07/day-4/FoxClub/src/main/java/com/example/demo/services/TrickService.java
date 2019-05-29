package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrickService {
    List<String> trickList;

    public TrickService(){
        trickList = new ArrayList<>();
        trickList.add("SQL");
        trickList.add("Java");
        trickList.add("HTML");
        trickList.add("Javascript");
        trickList.add("Spring Master");
        trickList.add("C++");
        trickList.add("Android");
        trickList.add("C#");
    }

    public List<String> getTrickList() {
        return trickList;
    }
}
