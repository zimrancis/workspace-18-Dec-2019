package com.ciphersnippet.peofileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciphersnippet.rentcloud.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
