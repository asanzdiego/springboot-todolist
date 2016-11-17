package app.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import app.entities.ToDo;

public interface ToDoRepository extends PagingAndSortingRepository<ToDo, Long> {

    @Query("select t from ToDo t where t.name like %:name%")
    Page<ToDo> findByName(@Param("name") String name, Pageable pageable);

}