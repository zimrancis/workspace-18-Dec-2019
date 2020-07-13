package com.ciphersnippet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.Repository;

import com.ciphersnippet.model.Model;

//public interface StudentRepo extends Repository<Model, Integer> {
	
	//Model save(Model model);

public interface ModelRepository extends JpaRepository<Model, Integer> {	

}
