package com.ciphersnippet.integrationtesting.demo.todo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ciphersnippet.integrationtesting.demo.todo.model.Todo;

import java.util.List;

/**
 * @author 
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Query(
            "Select t FROM Todo t WHERE LOWER(t.title) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(t.description) LIKE LOWER(CONCAT('%', :searchTerm, '%'))"
    )
    public List<Todo> search(@Param("searchTerm") String searchTerm);
}
