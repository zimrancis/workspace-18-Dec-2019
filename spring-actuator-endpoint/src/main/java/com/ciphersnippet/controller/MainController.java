package com.ciphersnippet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String greeting() {	
		return "Hellow Spring Boot ring Boot from Get";
	}
	@RequestMapping(value="/hello", method = RequestMethod.POST)
	public String greeting2() {
		return "Hellow Spring Boot ring Boot from Post";
	}

}

//http://localhost:8080/actuator/health
//http://localhost:8080/actuator/info
//http://localhost:8080/actuator/beans
//http://localhost:8080/actuator/metrics
// http://localhost:8080/actuator/metrics/jvm.threads.states
//http://localhost:8080/actuator/threaddump
//http://localhost:8080/actuator/heapdump
