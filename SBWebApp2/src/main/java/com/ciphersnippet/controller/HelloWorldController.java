package com.ciphersnippet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value = "/soslog", method = RequestMethod.POST)
	public String sos_logPage(Model model) {
		return "logged-in";
	}

	@RequestMapping("/")
	public String indexPage(Model model) {
		return "index";
	}
	
	@RequestMapping("/404")
	public String errorPage(Model model) {
		return "404";
	}

	@RequestMapping("/blog")
	public String blogPage(Model model) {
		return "blog";
	}

	@RequestMapping("/basket")
	public String basketPage(Model model) {
		return "basket";
	}

	@RequestMapping("/category")
	public String categoryPage(Model model) {
		return "category";
	}

	@RequestMapping("/category-full")
	public String categoryFullPage(Model model) {
		return "category-full";
	}

	@RequestMapping("/category-right")
	public String categoryRightPage1(Model model) {
		return "category-right";
	}

	@RequestMapping("/checkout1")
	public String checkout1Page(Model model) {
		return "checkout1";
	}

	@RequestMapping("/checkout2")
	public String checkout2Page(Model model) {
		return "checkout2";
	}

	@RequestMapping("/checkout3")
	public String checkout3Page(Model model) {
		return "checkout3";
	}

	@RequestMapping("/checkout4")
	public String checkout4Page(Model model) {
		return "checkout4";
	}

	@RequestMapping("/contact")
	public String contactPage(Model model) {
		return "contact";
	}
	
	@RequestMapping("/customer-account")
	public String customerPage(Model model) {
		return "customer-account";
	}
	@RequestMapping("/customer-order")
	public String customerOrderPage(Model model) {
		return "customer-order";
	}
	
	@RequestMapping("/customer-orders")
	public String customerOrdersPage(Model model) {
		return "customer-orders";
	}
	@RequestMapping("/customer-wishlist")
	public String customerWishlistPage(Model model) {
		return "customer-wishlist";
	}

	@RequestMapping("/detail")
	public String detailPage(Model model) {
		return "detail";
	}

	@RequestMapping("/faq")
	public String faqPage(Model model) {
		return "faq";
	}

	@RequestMapping("/post")
	public String postPage(Model model) {
		return "post";
	}	

	@RequestMapping("/register")
	public String registerPage(Model model) {
		return "register";
	}

	@RequestMapping("/text")
	public String textPage(Model model) {
		return "text";
	}

	@RequestMapping("/text-right")
	public String textRightPage(Model model) {
		return "text-right";
	}

}