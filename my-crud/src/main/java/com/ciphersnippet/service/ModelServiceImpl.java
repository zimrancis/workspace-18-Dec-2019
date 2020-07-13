package com.ciphersnippet.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciphersnippet.model.Model;
import com.ciphersnippet.repository.ModelRepository;

@Service
public class ModelServiceImpl implements ModelService {

	@Autowired
	private ModelRepository modelRepository;

	public Model save(Model model) {
		return modelRepository.save(model);
	}

	/*
	 * public Optional<Model> fetch(int id) {
	 * 
	 * return modelRepository .findById(id); };
	 */
    
	// I do not want controller to check null or something like
	// that sort, I rather want it being checked by Service as 
	//Service is my business logic! 
	public Model fetchModelById(int id) {

		Optional<Model> model = modelRepository.findById(id);
		if (model.isPresent()) {

			return model.get();
		}
		return null;

	}

}
