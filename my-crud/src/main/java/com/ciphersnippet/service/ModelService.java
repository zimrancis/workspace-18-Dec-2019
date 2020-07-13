package com.ciphersnippet.service;

import org.springframework.stereotype.Service;

import com.ciphersnippet.model.Model;

@Service
public interface ModelService {
	
	public Model save(Model model);

	public Model fetchModelById(int id);

}
/**
 * Spring Data Jpa 2.O (0) onwards they use 'Optional' as a 
 * return from the fetch ...
 * In general Optional is long storage sort, Optional is the way
 * which introduced in java 8 where you can avoid the null point exception
 * because, in the earlier versions we had to check NullPointerException in 
 * every case like, 
 * A Class has a Group, and Group has a Unit. So in order to access Unit we 
 * first require to check if the Class is empty or not, if not then further 
 * to check whether the Group is equals to null or not..
 * so in Optional we don't need to do this!    
 * 
 * So the point is, in spring data jpa, when you find something it 
 * return you optional, right!
 * */