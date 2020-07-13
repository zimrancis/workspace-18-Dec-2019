package org.o7planning.sbmultiviewresolver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ciphersnippet.been.User;

@Controller
public class MainController {

	@RequestMapping(value = { "/testJsp" }, method = RequestMethod.GET)
	public String testJspView() {

		return "testJsp";
	}

	@RequestMapping(value = { "/testThymeleaf" }, method = RequestMethod.GET)
	public String testThymeleafView(User user) {

		return "th_page1";
	}

	//@GetMapping("/addUser")
	@RequestMapping(value = { "/addUser" }, method = RequestMethod.GET)
	public String sendForm(User user) {

		return "th_addUser";
	}

	//@PostMapping("/addUser")
	@RequestMapping(value = { "/addUser" }, method = RequestMethod.POST)
	public String processForm(User user) {

		return "th_showMessage";
	}

	@RequestMapping(value = { "/testFreeMarker" }, method = RequestMethod.GET)
	public String testFreeMarkerView() {

		return "testFreeMarker";
	}

}