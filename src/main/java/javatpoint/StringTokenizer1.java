package javatpoint;

import java.util.StringTokenizer;
//hasMoreTokens() method
public class StringTokenizer1 {
	public static void main(String args[]) {  
		StringTokenizer st = new StringTokenizer("My name is Salman Wahid Chowdhury");
		while (st.hasMoreTokens()) {
			
	        System.out.println(st.nextToken());    
	    }    
	}    

}
