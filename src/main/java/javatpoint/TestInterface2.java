package javatpoint;

public class TestInterface2 {
	public static void main(String args[]) {
		Bank5 b=new SBI5();  
		System.out.println("ROI: "+b.rateOfInterest());  
	}  

}


interface Bank5 {
	float rateOfInterest();  
}  
class SBI5 implements Bank5 {
	public float rateOfInterest() {
		return 9.15f;
	}  
}  
class PNB5 implements Bank5 {
	public float rateOfInterest() {
		return 9.7f;
	}  
}  