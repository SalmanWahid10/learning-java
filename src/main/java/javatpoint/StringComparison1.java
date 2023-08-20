package javatpoint;

public class StringComparison1 {
	public static void main(String args[]) {
		
	String s1 = "Salman";
	String s2 = "Salman";
	String s3 = new String("Salman");
	String s4 = "Wahid";
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	
	}
}
