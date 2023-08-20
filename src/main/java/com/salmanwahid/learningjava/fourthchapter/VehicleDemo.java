package com.salmanwahid.learningjava.fourthchapter;

public class VehicleDemo {
	int passenger;
	int fuelcap;
	int mpg;
	public int totalkmrun( ) {
		int totalkm = fuelcap/mpg;
		return totalkm;
	}
	
	public static void main(String[] args) {
		VehicleDemo minivan = new VehicleDemo();
		int range;
		
		
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 2;
		
		System.out.println(minivan.totalkmrun());
		range = minivan.fuelcap*minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passenger +"with a range 0f " + range);
	}

}
