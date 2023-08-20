package javatpoint;

public class TestPolymorphism2 {
	public static void main(String args[]) {
		Shape s;
		s = new RectangleR();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
	}

}

class Shape {
	void draw() {
		System.out.println("drawing...");
	}
}
class RectangleR extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("drawing Circle...");
	}
}
class Triangle extends Shape {
	void draw() {
		System.out.println("drawing Triangle...");
	}
}