package com.ciphersnippet.configconsumer.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProdConfiguration {

	@Autowired
	Environment environment;
	
	public String getMaxProd() {
		return environment.getProperty("member.rent.max");
	}
	
	public String getMinProd() {
		return environment.getProperty("member.rent.min");
	}
	
	public String getDiscountProd() {
		return environment.getProperty("member.price.discount");
	}
}
