package javatpoint;

interface Drawable5 {
	void draw();  
	default void msg() {
		System.out.println("default method");
	}  
}  
class Rectangle5 implements Drawable5 {
	public void draw() {
		System.out.println("drawing rectangle");
	}  
}  

public class InterfaceDefault {
	public static void main(String args[]) {
		Drawable5 d = new Rectangle5();
		d.draw();  
		d.msg();
		
	}  

}
