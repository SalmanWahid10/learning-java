package BeginwithJava;

import java.util.Scanner;

public class Q4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i, fact=1;
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+ " is: "+fact);
	}

}
