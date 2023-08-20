package javatpoint;

public class StringReplaceExample {
	public static void main(String args[]) {
		String str = "ssss-aaaa-llll-mmmm-aaaa-nnnn";  
	    String rs = str.replace("a","o");
	    System.out.println(rs);
	        
	    rs = rs.replace("o","a");
	    System.out.println(rs);  
	
	}

}
