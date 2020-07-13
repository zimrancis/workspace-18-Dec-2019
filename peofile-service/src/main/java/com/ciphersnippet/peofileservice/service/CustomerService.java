package com.ciphersnippet.peofileservice.service;
import com.ciphersnippet.rentcloud.model.Customer;

public interface CustomerService {
	public Customer save(Customer customer);

	public Customer fetchModelById(int id);

}
