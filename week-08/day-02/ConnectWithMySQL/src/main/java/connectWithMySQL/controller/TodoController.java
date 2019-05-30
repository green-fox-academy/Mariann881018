package connectWithMySQL.controller;

import connectWithMySQL.model.Todo;
import connectWithMySQL.service.IToDoService;
import connectWithMySQL.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController implements CommandLineRunner {

  @Autowired
  private IToDoService iToDoService;

  @Autowired
  private ToDoService toDoService;

//  @GetMapping("/todo")    // parts for the beginning of the exercise
//  @ResponseBody
//  public String todo() {
//    return "This is my first Todo"  ;
//  }
//
//  @GetMapping("/todo")
//  public String list(Model model) {
//    model.addAttribute("todos", toDoService.findAll());
//    return "todolist" ;
//  }

  @GetMapping("/todo")
  public String listActives(Model model, @RequestParam(required = false) boolean isActive) {
    if (isActive){
      model.addAttribute("todos",toDoService.findActiveElements());
    } else
    model.addAttribute("todos", toDoService.findAll());
    return "todolist";
  }

  @GetMapping("/createTask")
  public String createNewTask(Model model) {
    model.addAttribute("todo", new Todo());
    return "create";
  }

  @PostMapping("/createTask")
  public String addNewTask(Todo todo) {
    toDoService.save(todo);
    return "redirect:/todo";
  }

  @GetMapping("/deleteTask")  // should be /{id}/delete
  public String deleteTask(@RequestParam long id) {
    toDoService.delete(id);
    return "redirect:/todo";
  }

  @GetMapping("/editTask")      // should be /{id}/edit
  public String getEditorPage(Model model, @RequestParam long id) {
    model.addAttribute("todo",toDoService.findById(id));
    return "edit";
  }

  @PostMapping("/editTask")    // should be: /{id}/edit
  public String updateTask(@RequestParam long id, boolean urgent, boolean done, String title) {
    toDoService.update(id, urgent, done, title);
    return "redirect:/todo";
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
