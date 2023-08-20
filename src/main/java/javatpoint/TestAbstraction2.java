package javatpoint;

public class TestAbstraction2 {
	public static void main(String args[]) {
		Bike3 obj = new Honda1();
		obj.run();
		obj.changeGear();
	}

}

abstract class Bike3 {
	Bike3(){
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
	}
}
class Honda1 extends Bike3 {
	void run() {
		System.out.println("running safely");
	}
}