package com.salmanwahid.learningjava.javaTpoint;

public class Leapyearexample {
	public static void main(String[] args) {
		int year=2002;
		if(((year % 4 ==0)&&(year % 100 !=0))||(year %400 ==0)) {
			System.out.println("LEAP YEAR");
		}
		else {
			System.out.println("COMMON YEAR");
		}
	}

}