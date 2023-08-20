package com.salmanwahid.javaexercise;

public class logicaloperator {
	public static void main(String args[]) {
		boolean adult = false;
		boolean student = true;
		boolean salman = false;
		
		System.out.println(adult && student);
		System.out.println(adult || student);
		System.out.println((adult || student)  && salman);
		System.out.println((!adult || student) && salman);
		System.out.println((!adult || student) && !salman);
		
	}

}
