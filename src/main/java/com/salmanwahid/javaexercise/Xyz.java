package com.salmanwahid.javaexercise;

import java.util.Scanner;

public class Xyz {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Hi.. How are you? ");
		
		String x = scan.nextLine();
		if(x.contains("hello")) { 
			System.out.println("jhh");
		}else if(x.contains("fine")) {
			System.out.println("All right..");
		} else if(x.contains("not good")) {
			System.out.println("Why? What happened?");
		} else {
			System.out.println("Well...");
		}
		String y = scan.nextLine();
		
		System.out.println("What are u doing right now?");
		String d = scan.nextLine();
		
		System.out.println("okk bye...:)");
		

	}

}
