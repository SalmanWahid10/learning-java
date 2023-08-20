package javatpoint;

public class StrFormat {
	public static void main(String args[]) {
		String s1 = new String("Salman");
		String s2 = new String("Wahid");
		String s3 = new String("xyz");
		String s = String.format("%s%s%s",s1,s2,s3);
		
		System.out.println(s.toString());
		
	}

}
