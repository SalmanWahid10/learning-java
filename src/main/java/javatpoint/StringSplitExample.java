package javatpoint;

public class StringSplitExample {
	public static void main(String args[]) {
		
		String s1 = "welcome to split world";  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",0)) {
			System.out.println(w);  
		}
		System.out.println("returning words:");
		for(String w:s1.split("\\s",2)) {
			System.out.println(w);
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",3)) {
			System.out.println(w);  
		}  
		  
	}

}
