package com.salmanwahid.javaexercise;

import java.time.LocalDate;
import java.util.Scanner;

public class newthing {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("What is your name ?");
		
		String userName = scanner.nextLine();
		System.out.println("HELLO "+userName);
		
		System.out.println("What is your age ?");
		int age = scanner.nextInt();
		int year = LocalDate.now().minusYears(age).getYear();
		System.out.println("Ohh, you were born in "+year);
		
		if (age>=18) {
			System.out.println("So you are an adult... ");
			} else {
				System.out.println("So you are a teenager..");
			}
		System.out.println("Tell me about yourself..");
		String about = scanner.nextLine();
		
		
		System.out.println("Thank u... Talk to u latter.. Bye");
		
		
		
	}

}
