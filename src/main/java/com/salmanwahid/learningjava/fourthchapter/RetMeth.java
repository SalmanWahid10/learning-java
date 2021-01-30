package com.salmanwahid.learningjava.fourthchapter;

public class RetMeth {
	int passenger;
	int fuelcap;
	int mpg;
	
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passenger = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		range1 = minivan.range2();
		range2 = sportscar.range2();
		
		System.out.println("Minivan can carry " + minivan.passenger + "with a range of " + range1 + "Miles");
		System.out.println("Sportscar can carry " + sportscar.passenger + "with a range of " + range2 + "Miles");
		
	}

}
