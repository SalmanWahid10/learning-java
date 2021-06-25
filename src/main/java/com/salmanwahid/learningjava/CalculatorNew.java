package com.salmanwahid.learningjava;

import java.util.Scanner;

public class CalculatorNew {
	public static void main(String args[]) {
		String yn;
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first no.");
			
			double a = sc.nextDouble();
			System.out.println("Enter second no.");
			
			double b = sc.nextDouble();
			System.out.println("Enter symbol.");
			
			String symbol = sc.next();
			double result;
			switch(symbol) {
				case"+":result = a+b;
					System.out.println("Addition is: "+result);
				break;
				case"-":result = a-b;
					System.out.println("Subtraction is: "+result);
				break;
				case"*":result = a*b;
					System.out.println("Multiplication is: "+result);
				break;
				case"/":result = a/b;
					System.out.println("Division is: "+result);
				break;
				default:
					System.out.println("Invalid symbol...");
			
				}
		System.out.println("Do you continue(Press y for YES and n For No)");
		 yn = sc.next();
	
		}while(yn.equals("y")||yn.equals("Y"));
	}

}
