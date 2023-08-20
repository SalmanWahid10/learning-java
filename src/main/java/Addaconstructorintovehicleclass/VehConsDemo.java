package Addaconstructorintovehicleclass;

public class VehConsDemo {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		double gallons;
		int dist = 252;
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
	}

}
class Vehicle {
	int passenger;
	int fuelcap;
	int mpg;
	
	Vehicle(int p, int f, int m) {
		passenger = p;
		fuelcap = f;
		mpg = m;
	}
	int range() {
		return mpg * fuelcap;
	}
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}
