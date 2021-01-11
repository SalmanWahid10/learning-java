package com.salmanwahid.learningjava.fourthchapter;

public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		int range;
		
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		range = minivan.fuelcap*minivan.mpg;
		System.out.println("Minivan can carry" + minivan.passenger +"with a rane 0f " + range);
	}

}
class Vehicle {
	int passenger;
	int fuelcap;
	int mpg;
	
}