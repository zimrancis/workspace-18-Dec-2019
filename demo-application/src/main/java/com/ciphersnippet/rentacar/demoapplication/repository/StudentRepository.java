package com.ciphersnippet.rentacar.demoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciphersnippet.rentacar.demoapplication.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
