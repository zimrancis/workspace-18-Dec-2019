package com.loiane.springcloudhello.service;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loiane.springcloudhello.model.Contact;
import com.loiane.springcloudhello.repository.ContactRespository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactService {
	
    @Autowired
	private ContactRespository ContactRepository;

    public List<Contact> findAll() {
        return ContactRepository.findAll();
    }

    public Optional<Contact> findById(Long id) {
        return ContactRepository.findById(id);
    }

    public Contact save(Contact stock) {
        return ContactRepository.save(stock);
    }

    public void deleteById(Long id) {
    	ContactRepository.deleteById(id);
    }
}
