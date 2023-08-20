package BeginwithJava;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a positive integer:");
		int num = sc.nextInt();
		
		System.out.println("The multiplication table of this number: ");
		
		for (int i=0; i<=10; i++) {
			
			System.out.println(num+ " * "+(i+1)+ " = "+(num * (i+1)));
		}
	}

}
