package com.ciphersnippet.peofileservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ciphersnippet.peofileservice.repository.CustomerRepository;
import com.ciphersnippet.rentcloud.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}
	
	/*
	 * public Optional<Model> fetch(int id) {
	 * 
	 * return modelRepository .findById(id); };
	 */
    
	// I do not want controller to check null or something like
	// that sort, I rather want it being checked by Service as 
	//Service is my business logic! 
	public Customer fetchModelById(int id) {

		Optional<Customer> customer = customerRepository.findById(id);
		if (customer.isPresent()) {

			return customer.get();
		}
		return null;

	}

}
