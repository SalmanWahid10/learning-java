package javatpoint;

public class TestPolymorphism {
	public static void main(String args[]) {
		BankB b;
		b = new SBIs();
		System.out.println("SBIs Rate of Interest: "+ b.getRateOfInterest());
		
		b = new ICICIi();
		System.out.println("ICICIi Rate of Interest: "+ b.getRateOfInterest());
		
		b = new AXISa();
		System.out.println("AXISa Rate of Interest: "+ b.getRateOfInterest());
	}

}

class BankB {
	float getRateOfInterest() {
		return 0;
	}
}
class SBIs extends BankB {
	float getRateOfInterest() {
		return 8.4f;
	}
}
class ICICIi extends BankB {
	float getRateOfInterest() {
		return 7.3f;
	}
}
class AXISa extends BankB {
	float getRateOfInterest() {
		return 9.7f;
	}
}