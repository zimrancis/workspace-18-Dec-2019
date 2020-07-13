package com.ciphersnippet.peofileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ciphersnippet.peofileservice.service.VehicleService;
import com.ciphersnippet.rentcloud.model.Vehicle;

@RestController
@RequestMapping(value = "/v_service")
public class VehicleProfileController {
	
	@Autowired
	VehicleService vehicleService;	
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public Vehicle save(@RequestBody Vehicle vehicle) {
		return vehicleService.save(vehicle);

	}

}
