package javatpoint;
//interface inheritance
interface Printable2 {
	void print();
}
interface Showable2 extends Printable2 {
	void show();  
}  

public class TestInterface4 implements Showable2 {
	public void print() {
		System.out.println("Hello");
	}  
	public void show() {
		System.out.println("Welcome");
	}  
	  
	public static void main(String args[]) {
		TestInterface4 obj = new TestInterface4();
		obj.print();
		obj.show();  
	
	}  

}
