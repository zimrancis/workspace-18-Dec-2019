package com.ciphersnippet.secureapp;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	public String Home() {
		return "index.jsp";
	}

}
