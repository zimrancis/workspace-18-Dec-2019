package com.ciphersnippet.demoapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciphersnippet.demoapplication.model.Customer;
import com.ciphersnippet.demoapplication.service.CustomerService;

@RestController(value = "/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping
	public List<Customer> getAllCustomers(Model model) {

		List<Customer> listOfCustomers = customerService.getAllCustomers();
		model.addAttribute("customer", new Customer());
		model.addAttribute("listOfCustomers", listOfCustomers);
		return listOfCustomers;
	}

	@GetMapping
	public String goToHomePage() {
		return "redirect:/getAllCustomers";
	}

	@GetMapping
	public void getCustomerById(@PathVariable int id) {
		customerService.getCustomer(id);
	}

	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);

	}

	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer); 

	}	

	@DeleteMapping
	public void deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);


	}	
}

/*
 * @RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
		Person p = personService.create(firstName, lastName, age);
		return p.toString();
	} //http://localhost:8080/create?firstName=Jack&lastName=Fox&age=42
	
	@RequestMapping("/get")
	public Person getPerson(@RequestParam String firstName) {
		return personService.getByFirstName(firstName);
	} //http://localhost:8080/get?firstName=Tom
	@RequestMapping("/getAll")
	public List<Person> getAll(){
		return personService.getAll();
	} //http://localhost:8080/getAll
	@RequestMapping("/update")
	public String update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
		Person p = personService.update(firstName, lastName, age);
		return p.toString();
	} //http://localhost:8080/update?firstName=Tom&lastName=Owne&age=30
	@RequestMapping("/delete")
	public String delete(@RequestParam String firstName) {
		personService.delete(firstName);
		return "Deleted "+firstName;
	} //http://localhost:8080/delete?firstName=Tom
	@RequestMapping ("/deleteAll")
	public String deleteAll() {
		personService.deleteAll();
		return "Deleted all records";
	} //http://localhost:8080/deleteAll
	*/
