package javatpoint;

import java.util.Scanner;

public class ScannerHasNextExample2 {
	public static void main (String args[]) {
		String s = "Hello, This is JavaTpoint.";
		Scanner scan = new Scanner(s);		
		System.out.println(("Result: " +scan.hasNext()));
		System.out.println(("String: " +scan.nextLine()));
		System.out.println(("Final Result: " +scan.hasNext()));
		
		System.out.println(("Name: " +scan.hasNext()));
		
		scan.close();
			
	}

}
