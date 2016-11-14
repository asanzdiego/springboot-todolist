package app.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import app.entities.ToDo;

@RepositoryRestResource(collectionResourceRel = "todo", path = "todo")
public interface ToDoRepository extends PagingAndSortingRepository<ToDo, Long> {

    List<ToDo> findByName(@Param("name") String name);

}