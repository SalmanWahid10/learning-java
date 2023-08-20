package javatpoint;

//With printing in reverse order

public class StringLengthExample {
	public static void main(String argvs[]) {
		
		String str = "Welcome To JavaTpoint";  
		int size = str.length();
		System.out.println("Reverse of the string: " + "'" + str + "'" + " is");
	  
		for(int i=0;i<size;i++) {		
			System.out.print(str.charAt(str.length()-i-1));
		}  
	  
	} 

}
