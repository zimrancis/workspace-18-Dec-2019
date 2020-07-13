package com.ciphersnippet.configconsumer.configconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ciphersnippet.configconsumer.configconsumer.model.MemberProdConfiguration;
import com.ciphersnippet.configconsumer.configconsumer.model.MemberProfileConfiguration;

@Controller
public class ProfileController {
	
	@Autowired
	MemberProfileConfiguration memberProfileConfiguration;
	@Autowired
	MemberProdConfiguration memberProdConfiguration;
	
	@RequestMapping("/profile")
	public String getConfig(Model model) {
		
		model.addAttribute("model", memberProfileConfiguration.getDefaultModel());
		model.addAttribute("max", memberProfileConfiguration.getMaxRatePeriod());
		model.addAttribute("min", memberProfileConfiguration.getMinRatePeriod());
		return "mprofile"; 
	}
	@RequestMapping("/profile/prod")
	public String getConfigProd(Model model) {
		
		model.addAttribute("max", memberProdConfiguration.getMaxProd());
		model.addAttribute("min", memberProdConfiguration.getMinProd());
		model.addAttribute("discount", memberProdConfiguration.getDiscountProd());
		return "mprod"; 
	}
}