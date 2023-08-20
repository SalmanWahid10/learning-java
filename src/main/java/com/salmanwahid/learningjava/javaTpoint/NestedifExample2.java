package com.salmanwahid.learningjava.javaTpoint;

public class NestedifExample2 {
	public static void main(String[] args) {
		int age = 12;
		int weight = 43;
		
		if(age>=18) {
			if (weight>50) {
				System.out.println("You are eligible to donate BLOOD");
				
			}else {
				System.out.println("You are not eligible to donate BLOOD");
			}
		}else {
			System.out.println("Age must be greater than 18");
		}
	}

}
