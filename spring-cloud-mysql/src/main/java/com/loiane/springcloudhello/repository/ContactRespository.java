package com.loiane.springcloudhello.repository;

import com.loiane.springcloudhello.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRespository extends JpaRepository<Contact, Long> {
}
