package javatpoint;

public class TestInterface1 {
	public static void main(String args[]) {
		Drawable d = new Circle4();
		d.draw();
	}

}

interface Drawable {
	void draw();
}
class Rectangle4 implements Drawable {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle4 implements Drawable {
	public void draw() {
		System.out.println("Drawing Circle");
	}
}