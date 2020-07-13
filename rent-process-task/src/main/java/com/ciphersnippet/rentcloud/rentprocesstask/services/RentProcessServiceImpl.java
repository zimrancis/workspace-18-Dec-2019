package com.ciphersnippet.rentcloud.rentprocesstask.services;

import org.springframework.stereotype.Service;

@Service
public class RentProcessServiceImpl implements  RentProcessService {
	
	public boolean validateDL (String dlNumber ) {
		return dlNumber.length() > 5;
		
	}

}

//java -jar target/rent-process-task-0.0.1-SNAPSHOT.jar 123456
