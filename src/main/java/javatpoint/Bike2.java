package javatpoint;
//Example of method overriding
class Vehicle1 {
	void run() {
		System.out.println("Vehicle is running.");
	}
}

public class Bike2 extends Vehicle1 {
	void run() {
		System.out.println("Bike is running safely.");
	}
	public static void main(String args[]) {
		Bike2 obj = new Bike2();
		obj.run();
	}

}
