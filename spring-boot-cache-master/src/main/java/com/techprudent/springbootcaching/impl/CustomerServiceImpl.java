package com.techprudent.springbootcaching.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.techprudent.springbootcaching.entity.Customer;
import com.techprudent.springbootcaching.repo.CustomerRepo;
import com.techprudent.springbootcaching.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepo customerRepo;

	@Autowired
	public CustomerServiceImpl(CustomerRepo customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}

	@Cacheable(value = "customer-id")
	public Customer getCustomer(long id) {
		try {
			/* simulate slow service */
			Thread.sleep(2 * 1000);
		} catch (Exception e) {
		}
		return this.customerRepo.findById(id).get();
	}

	public Customer createCustomer(Customer customer) {
		return this.customerRepo.save(customer);
	}

	@CacheEvict(allEntries=true, cacheNames="customer-id")
	public Customer updateCustomer(Customer customerUpdate) {
		Customer customer = this.customerRepo.findById(customerUpdate.getId()).get();
		customer.setContact(customerUpdate.getContact());
		customer.setGender(customerUpdate.getGender());
		customer.setName(customerUpdate.getName());

		return this.customerRepo.save(customer);
	}

	public void deleteCustomer(long id) {
		this.customerRepo.deleteById(id);
	}

	@CachePut(value = "customer-name")
	public Customer getCustomerByName(String name) {
		try {
			/* simulate slow service */
			Thread.sleep(2 * 1000);
		} catch (Exception e) {
		}
		return this.customerRepo.getCustomerByName(name);
	}

}
