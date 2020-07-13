package com.ciphersnippet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ciphersnippet.model.Model;
import com.ciphersnippet.service.ModelService;

@RestController
public class MyController {
	
	@Autowired
	ModelService modelService;
	
	@RequestMapping(value = "/model", method = RequestMethod.POST)
	public Model save(@RequestBody Model model) {
		
		return modelService.save(model);
		
	}
	
	@RequestMapping(value = "/model", method = RequestMethod.GET)
	public ResponseEntity<Model> fetchModel(@RequestParam int id) {
		
		Model model = modelService.fetchModelById(id);
		if(model==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(model);
		
	}

}
