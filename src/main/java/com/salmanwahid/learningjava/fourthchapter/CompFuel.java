package com.salmanwahid.learningjava.fourthchapter;

public class CompFuel {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		double gallons;
		int dist = 252;
		
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passenger = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		gallons = minivan.fuelIndeed(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		gallons = sportscar.fuelIndeed(dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
	}

}
