package com.ciphersnippet.stock.dbservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ciphersnippet.stock.dbservice.model.Quote;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {
    Quote findByUserName(String username);
}