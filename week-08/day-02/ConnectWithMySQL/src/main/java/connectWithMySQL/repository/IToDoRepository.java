package connectWithMySQL.repository;

import connectWithMySQL.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface IToDoRepository extends CrudRepository<Todo, Long> {

}