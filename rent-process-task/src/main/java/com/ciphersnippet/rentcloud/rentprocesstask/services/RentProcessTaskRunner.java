package com.ciphersnippet.rentcloud.rentprocesstask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//@Service
public class RentProcessTaskRunner implements CommandLineRunner {

	@Autowired
	RentProcessService rentProcessService;

	public void run(String... args) throws Exception {

		if (args.length > 0) {
			System.out.println("task running with arguments");

			if (rentProcessService.validateDL(args[0])) {
				System.out.println("valid driving lisense");
			} else
				System.out.println("invalid driving lisense");
		} else
			System.out.println("task running without arguments");
	}
}
