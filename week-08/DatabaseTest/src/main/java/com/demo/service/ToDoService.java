package com.demo.service;

import com.demo.model.Todo;
import com.demo.repository.IToDoRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService implements IToDoService {

  private IToDoRepository toDoRepository;

  public ToDoService(IToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @Override
  public List<Todo> findAll() {
      List<Todo> todoList = new ArrayList<>();
      toDoRepository.findAll().forEach(todo -> todoList.add(todo));
      return todoList;
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
}
