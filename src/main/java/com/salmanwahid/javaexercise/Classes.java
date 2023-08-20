package com.salmanwahid.javaexercise;

import java.time.LocalDate;

public class Classes {
	public static void main(String args[]) {
		Passport ukPassport = new Passport("12345" , "England(UK)",
				 LocalDate.of(2025,1, 1));
		
		Passport usPassport = new Passport("67890", "USA",
				 LocalDate.of(2030, 1, 1));
		System.out.println(usPassport+ " and " +ukPassport);
	}
	
	static class Passport {
		String number;
		String country;
		LocalDate expiryDate;
		
		Passport(String number, String country, LocalDate expiryDate) {
			this.number = number;
			this.country = country;
			this.expiryDate = expiryDate;
		}
	}

}
