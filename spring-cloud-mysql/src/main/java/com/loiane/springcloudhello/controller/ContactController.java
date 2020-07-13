package com.loiane.springcloudhello.controller;

import com.loiane.springcloudhello.model.Contact;
import com.loiane.springcloudhello.repository.ContactRespository;
import com.loiane.springcloudhello.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping({"/contacts"})
public class ContactController {

    @Autowired
    private ContactRespository repository;
    
    @Autowired
    private ContactService contactService;

    ContactController(ContactRespository contactRepository) {
        this.repository = contactRepository;
    }

    @GetMapping
    public List<?> findAll(){
        return repository.findAll();
    }
    
	/*
	 * @GetMapping public ResponseEntity<List<Contact>> findAll() { return
	 * ResponseEntity.ok(contactService.findAll()); }
	 */

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Contact> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    
	/*
	 * @PostMapping public Contact create(@RequestBody Contact contact){ return
	 * repository.save(contact); }
	 */
    
    @PostMapping
	public ResponseEntity<Contact> create(@Valid @RequestBody Contact contact) {
		return ResponseEntity.ok(contactService.save(contact));
	}
    
    @PutMapping(value="/{id}")
    public ResponseEntity<Contact> update(@PathVariable("id") long id,
                                          @RequestBody Contact contact){
      return repository.findById(id)
          .map(record -> {
              record.setName(contact.getName());
              record.setEmail(contact.getEmail());
              record.setPhone(contact.getPhone());
              Contact updated = repository.save(record);
              return ResponseEntity.ok().body(updated);
          }).orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
      return repository.findById(id)
          .map(record -> {
              repository.deleteById(id);
              return ResponseEntity.ok().build();
          }).orElse(ResponseEntity.notFound().build());
    }
}
