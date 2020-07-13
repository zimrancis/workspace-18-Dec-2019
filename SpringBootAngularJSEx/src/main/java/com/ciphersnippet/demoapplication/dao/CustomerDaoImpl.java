package com.ciphersnippet.demoapplication.dao;

import java.util.List;
import java.util.Optional;

import com.ciphersnippet.demoapplication.model.Customer;
import com.ciphersnippet.demoapplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {

		return customerRepository.findAll();
	}

	public Customer getCustomer(int id) {

		Optional<Customer> customer = customerRepository.findById(id);
		if (customer.isPresent()) {

			return customer.get();
		}
		return null;

	}

	public Customer addCustomer(Customer customer) {

		return customerRepository.save(customer);
	}

	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void deleteCustomer(int id) {

		Optional<Customer> customer = customerRepository.findById(id);

		customerRepository.deleteById(customer);
		;
	}

}
