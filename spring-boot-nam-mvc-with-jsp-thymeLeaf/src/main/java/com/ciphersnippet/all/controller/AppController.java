package com.ciphersnippet.all.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ciphersnippet.hardcoded.busnesslogic.ContactBusiness;
import com.ciphersnippet.model.Contact;

@Controller
public class AppController {
	
	@RequestMapping("/test")
	public String test() {
	 System.out.println("Welcome to home Page!");
	    return "test.jsp";
	}
	
	/*
	 * @RequestMapping("/list_contact") public String listContact(Model model) {
	 * 
	 * ContactBusiness business = new ContactBusiness(); List<Contact> contactList =
	 * business.getContactList();
	 * 
	 * model.addAttribute("contacts", contactList);
	 * 
	 * return "contact"; }
	 */
}
