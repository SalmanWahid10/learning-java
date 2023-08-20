package javatpoint;

public class TestSuper2 {
	public static void main(String args[]) {
		DogB d = new DogB();
		d.work();
	}

}

class AnimalB {
	void eat() {
		System.out.println("eating...");
	}
}
class DogB extends AnimalB {
	void eat() {
		System.out.println("eating bread...");
	}
	void bark() {
		System.out.println("barking...");
	}
	void work() {
		super.eat();
		bark();
	}
}
