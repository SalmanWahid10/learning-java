package javatpoint;

public class TestPolymorphism3 {
	public static void main(String args[]) {
		Animal4 a;
		a = new Dog4();
		a.eat();
		a = new Cat4();
		a.eat();
		a = new Lion();
		a.eat();
	}

}

class Animal4 {
	void eat() {
		System.out.println("eating...");
	}
}
class Dog4 extends Animal4 {
	void eat() {
		System.out.println("eating bread...");
	}
}
class Cat4 extends Animal4 {
	void eat() {
		System.out.println("eating rat...");
	}
}
class Lion extends Animal4 {
	void eat() {
		System.out.println("eating meat...");
	}
}
