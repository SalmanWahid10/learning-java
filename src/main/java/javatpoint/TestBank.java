package javatpoint;
// Example of abstract class.
public class TestBank {
	public static void main(String args[]) {
		Bank1 b;
		b = new SBI1();
		System.out.println("Rate of interest: "+b.getRateOfInterest()+"%");
		b = new PNB1();
		System.out.println("Rate of interest: "+b.getRateOfInterest()+"%");
	}

}

abstract class Bank1 {
	abstract int getRateOfInterest();
}
class SBI1 extends Bank1 {
	int getRateOfInterest() {
		return 7;
	}
}
class PNB1 extends Bank1 {
	int getRateOfInterest() {
		return 8;
	}
}