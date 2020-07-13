package com.cs.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
 
import com.cs.demo.domain.PostEntity;
 
public interface PostRepository extends CrudRepository<PostEntity, Long> {
	List<PostEntity> findByTitle(String title);
}