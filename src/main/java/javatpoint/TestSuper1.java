package javatpoint;

public class TestSuper1 {
	public static void main(String args[]) {
		DogA d = new DogA();
		d.printColor();
	}

}

class AnimalA {
	String color = "white";
}
class DogA extends AnimalA {
	String color = "black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}