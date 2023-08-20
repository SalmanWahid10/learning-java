package BeginwithJava;

import java.util.Scanner;

public class Q10 {
	public static void main(String args[]) {
		String yn;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a number:");
			int a = sc.nextInt();
			System.out.println("Enter b number:");
			int b = sc.nextInt();
			
			int sum = a+b;
			System.out.println("Sum: " + sum);
		 System.out.println("Do you continue(Press y for YES and n For No)");
		 yn = sc.next();
		}while(yn.equals("y")||yn.equals("Y"));
	}

}
