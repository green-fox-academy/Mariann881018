package connectWithMySQL.service;


import connectWithMySQL.model.Todo;
import connectWithMySQL.repository.IToDoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService implements IToDoService {

  private static IToDoRepository toDoRepository;

  public ToDoService(IToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    toDoRepository.findAll().forEach(todo -> todoList.add(todo));
    List<Todo> sortedById = todoList.stream().sorted(Comparator.comparingLong(Todo::getId)).collect(Collectors.toList());
    return sortedById;
  }

  public List<Todo> findActiveElements() {
    List<Todo> activeList = findAll().stream().filter(todo -> !todo.isDone()).collect(Collectors.toList());
    return activeList;
  }

  @Override
  public Todo findById(long id) {
    return toDoRepository.findById(id).orElse(null);
  }

  @Override
  public void save(Todo todo) {
    toDoRepository.save(todo);
  }

  @Override
  public void delete(long id) {
    toDoRepository.deleteById(id);
  }

  public Todo update(long id, boolean urgent, boolean done, String title){
    Todo todo = toDoRepository.findById(id).get();
    todo.setUrgent(urgent);
    todo.setDone(done);
    todo.setTitle(title);
    toDoRepository.save(todo);
    return todo;
  }
}
