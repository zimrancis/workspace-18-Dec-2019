package com.ciphersnippet.secureapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ciphersnippet.secureapp.impl.UserPrincipal;
import com.ciphersnippet.secureapp.model.User;
import com.ciphersnippet.secureapp.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findByUsername(username);
		
		if(user==null) 
			throw new UsernameNotFoundException("User not found = 404");
		
		return new UserPrincipal(user);
	}

}
