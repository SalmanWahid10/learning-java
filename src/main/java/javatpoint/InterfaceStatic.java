package javatpoint;

interface Drawable6 {
	void draw();  
	static int cube(int x) {
		return x*x*x;
	}  
}  
class Rectangle6 implements Drawable6 {
	public void draw() {
		System.out.println("drawing rectangle");
	}  
}  


public class InterfaceStatic {
	public static void main(String args[]) {
		Drawable6 d = new Rectangle6();  
		d.draw();  
		System.out.println(Drawable6.cube(3));  
	}  

}
