package com.salmanwahid.learningjava.fourthchapter;

public class Vehicle {
	int passenger;
	int fuelcap;
	int mpg;
	
	void range1() {
		System.out.println("Range is " + fuelcap*mpg);
	}
	int range2() {
		return mpg*fuelcap;
	}
	double fuelIndeed(int miles) {
		return (double) miles / mpg;
	}
	
}