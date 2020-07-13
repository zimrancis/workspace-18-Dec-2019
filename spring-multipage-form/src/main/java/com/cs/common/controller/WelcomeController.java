package com.cs.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * public class WelcomeController extends AbstractController{
 * 
 * @Override protected ModelAndView handleRequestInternal(HttpServletRequest
 * request, HttpServletResponse response) throws Exception {
 * 
 * return new ModelAndView("WelcomePage"); }
 * 
 * }
 */

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	public ModelAndView welcome() {
		return new ModelAndView("WelcomePage");
	}
	
}