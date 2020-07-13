package com.ciphersnippet.secureapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciphersnippet.secureapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
