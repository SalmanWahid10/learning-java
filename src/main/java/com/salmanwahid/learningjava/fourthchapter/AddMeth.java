package com.salmanwahid.learningjava.fourthchapter;

public class AddMeth {
	int passenger;
	int fuelcap;
	int mpg;
	

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passenger = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		System.out.println("Minivan can carry " +minivan.passenger+ ". ");
 		minivan.range1();
		
		System.out.println("Sportscar can carry " +sportscar.passenger+ ". ");
		sportscar.range1();
		
		
	}

}






