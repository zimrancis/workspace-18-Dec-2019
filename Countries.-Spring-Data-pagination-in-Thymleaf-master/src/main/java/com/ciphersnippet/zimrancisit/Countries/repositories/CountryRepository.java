package com.ciphersnippet.zimrancisit.Countries.repositories;

import com.ciphersnippet.zimrancisit.Countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
