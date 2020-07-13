package com.cs.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//public class UserController extends AbstractWizardFormController{
//
//	public UserController(){
//		setCommandName("userForm");
//	}
//	
//	@Override
//	protected Object formBackingObject(HttpServletRequest request)
//		throws Exception {
//		
//		return new User();
//	}
//	@Override
//	protected ModelAndView processFinish(HttpServletRequest request,
//		HttpServletResponse response, Object command, BindException errors)
//		throws Exception {
//		
//		//Get the data from command object
//		User user = (User)command;
//		System.out.println(user);
//		
//		//where is the finish page?
//		return new ModelAndView("ResultForm", "user", user);
//	}
//
//	@Override
//	protected ModelAndView processCancel(HttpServletRequest request,
//		HttpServletResponse response, Object command, BindException errors)
//		throws Exception {
//		
//		//where is the cancel page?
//		return new ModelAndView("WelcomePage");
//	}
//}

@Controller
@RequestMapping()
public class UserController {
	
}