package com.demo.service;

import com.demo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IToDoService {

  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
}
