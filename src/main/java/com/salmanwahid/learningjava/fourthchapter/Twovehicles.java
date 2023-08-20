package com.salmanwahid.learningjava.fourthchapter;

public class Twovehicles {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1; int range2;
		
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passenger = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportscar.fuelcap * sportscar.mpg;
		
		System.out.println("Minivan can carry " + minivan.passenger +
				           " with a range of " + range1);
		System.out.println("Sportscar can carry " + sportscar.passenger + " with a range of " + range2);
	}

}
class Vehicle1 {
	int passenger;
	int fuelcap;
	int mpg;
	
}