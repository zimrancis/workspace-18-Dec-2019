package com.techprudent.springbootcaching.service;

import com.techprudent.springbootcaching.entity.Customer;

public interface CustomerService {

	Customer getCustomer(long id);

	Customer createCustomer(Customer customer);

	Customer updateCustomer(Customer customerUpdate);

	void deleteCustomer(long id);

	Customer getCustomerByName(String name);

}
