package com.salmanwahid.javaexercise;

import java.time.LocalDate;

public class Classes {
	public static void main(String args[]) {
		Passport ukPassport = new Passport(number:"12345", country:"England(UK)",
				 LocalDate.of(year:2025, month:1, dayOfMonth:1));
		
		Passport usPassport = new Passport(number:"67890", country:"USA",
				 LocalDate.of(year:2030, month:1, dayOfMonth:1));
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
