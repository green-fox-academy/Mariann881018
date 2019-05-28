package com.demo.controller;

import com.demo.model.Todo;
import com.demo.service.IToDoService;
import com.demo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController implements CommandLineRunner {

  @Autowired
  private IToDoService iToDoService;

  @Autowired
  private ToDoService toDoService;


//  @GetMapping("/todo")
//  @ResponseBody
//  public String todo() {
//    return "This is my first Todo"  ;
//  }

  @GetMapping("/todo")
  public String list(Model model) {
    model.addAttribute("todos", toDoService.findAll());
    return "todolist" ;
  }

  @Override
  public void run(String... args) throws Exception {
    toDoService.save(new Todo(1,"I have to learn Object Relational Mapping", false, false));
  }

}