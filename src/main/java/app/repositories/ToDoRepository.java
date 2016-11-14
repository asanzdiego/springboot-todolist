package app.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import app.entities.ToDo;

public interface ToDoRepository extends PagingAndSortingRepository<ToDo, Long> {

	List<ToDo> findByName(@Param("name") String name);

}