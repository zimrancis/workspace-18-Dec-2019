package com.ciphersnippet.demoapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciphersnippet.demoapplication.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	void deleteById(Optional<Customer> customer);

}
