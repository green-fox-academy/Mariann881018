package connectWithMySQL.controller;

import connectWithMySQL.model.Todo;
import connectWithMySQL.service.IToDoService;
import connectWithMySQL.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

  @RequestMapping("/todo")
  public String listActives(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
    model.addAttribute("todos", toDoService.findAll().stream()
            .filter(todo -> !todo.isDone())
            .collect(Collectors.toList()));
    return "todolist";
  }


  @Override
  public void run(String... args) throws Exception {
    toDoService.save(new Todo(1,"do the washing up", true, false));
    toDoService.save(new Todo(2,"make the bed", false, false));
    toDoService.save(new Todo(3,"clean up the kitchen", true, true));
    toDoService.save(new Todo(4,"clean up the bathroom", false, false));
    toDoService.save(new Todo(5,"take down the rubbish", false, true));
    toDoService.save(new Todo(6,"vacuum the whole flat", true, false));
    toDoService.save(new Todo(7,"go out for a run", true, false));
    toDoService.save(new Todo(8,"watch the videos for tomorrow", true, false));
    toDoService.save(new Todo(9,"cook lunch for tomorrow", true, false));
  }
}