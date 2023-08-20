package javatpoint;

final class EmployeeN1 {
	
	final String pancardNumber;    
	public EmployeeN1(String pancardNumber) {
		this.pancardNumber=pancardNumber;    
	}  
	public String getPancardNumber() {
		return pancardNumber;    
	}    
}    
public class ImmutableDemo {
	public static void main(String args[]) {
		EmployeeN1 e = new EmployeeN1("ABC123");
		String s1 = e.getPancardNumber();
		System.out.println("Pancard Number: "+s1);
	}

}
