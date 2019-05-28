package connectWithMySQL.service;

import connectWithMySQL.model.Todo;
import java.util.List;

public interface IToDoService {

  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
}