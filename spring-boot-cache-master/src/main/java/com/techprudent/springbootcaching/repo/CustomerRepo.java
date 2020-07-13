package com.techprudent.springbootcaching.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprudent.springbootcaching.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

	Customer getCustomerByName(String name);

}
