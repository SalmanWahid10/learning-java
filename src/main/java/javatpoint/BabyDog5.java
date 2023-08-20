package javatpoint;
//polymorphism with multilevel inheritance

class Animal5 {
	void eat() {
		System.out.println("eating...");
	}
}
class Dog5 extends Animal5 {
	void eat() {
		System.out.println("eating fruits...");
	}
}
public class BabyDog5 extends Dog5 {
	void eat() {
		System.out.println("drinking milk...");
	}
	public static void main(String args[]) {
		Animal5 a1,a2,a3;
		a1 = new Animal5();
		a2 = new Dog5();
		a3 = new BabyDog5();
		a1.eat();
		a2.eat();
		a3.eat();
	}
}
