package com.ds.predicate.user;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAccessChecking {

	public static void main(String[] args) {
		
		Predicate<User> user = u -> u.username.equals("zobair")&&u.pwd.equals("java");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User Name:");
		String username=sc.next();
		System.out.print("Enter Password:");
		String pwd=sc.next();
		
		User user2=new User(username, pwd); 
		if(user.test(user2)) {
			System.out.println("Valid user and can avail all services ");
		}
		else {
			System.out.println("InValid user you cannot avail services ");
		}
	}

}