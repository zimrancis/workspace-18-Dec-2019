package com.ciphersnippet.peofileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ciphersnippet.peofileservice.service.CustomerService;
import com.ciphersnippet.rentcloud.model.Customer;

@RestController
@RequestMapping(value = "/c_service")
public class CustomerProfileController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);

	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public ResponseEntity<Customer> fetchModel(@RequestParam int id) {

		Customer model = customerService.fetchModelById(id);
		if (model == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(model);

	}

}
