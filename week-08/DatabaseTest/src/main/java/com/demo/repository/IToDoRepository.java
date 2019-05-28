package com.demo.repository;

import com.demo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface IToDoRepository extends CrudRepository<Todo, Long> {

}
