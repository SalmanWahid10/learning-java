package javatpoint;

public class TestInheritance {
	public static void main(String args[]) {
		Dog g = new Dog();
		g.bark();g.eat();
	}

}

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}
