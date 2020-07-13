package com.ciphersnippet.configconsumer.configconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciphersnippet.configconsumer.configconsumer.model.MemberProdConfiguration;
import com.ciphersnippet.configconsumer.configconsumer.model.MemberProfileConfiguration;

@RestController
public class RestProfileController {
	
	@Autowired
	MemberProfileConfiguration memberProfileConfiguration;
	@Autowired
	MemberProdConfiguration memberProdConfiguration;
	
	@RequestMapping("/restprofile")
	public MemberProfileConfiguration getConfig() {
		
		return memberProfileConfiguration; 
	}
	
	@RequestMapping("/restprofile/prod")
	public MemberProdConfiguration geProdtConfig() {
		
		return memberProdConfiguration; 
	}

}