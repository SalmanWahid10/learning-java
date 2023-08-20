package BeginwithJava;

import java.util.Scanner;

public class Q8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive integer: ");
		int num = sc.nextInt();
		boolean flag = true;
		
		for(int i=2;i<num;i++) {
			if (num%i ==0) {
				flag = false;
				break;
			}
		}
		if(flag && num>1) {
			System.out.println("Integer is prime.");
		} else {
			System.out.println("integeris not prime.");
		}
			
	}

}
