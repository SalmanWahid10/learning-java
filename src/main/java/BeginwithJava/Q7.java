package BeginwithJava;

import java.util.Scanner;

public class Q7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		int evenSum=0,oddSum=0;

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		do {
			if(num%2 == 0) {
				evenSum = evenSum+num;
			} else {
				oddSum = oddSum+num;
			}
			i++;
		}while(i<=num);
		
		System.out.println("Sum of the even integer: " + evenSum);
		System.out.println("Sum of the odd integer: " + oddSum);


	}

}
