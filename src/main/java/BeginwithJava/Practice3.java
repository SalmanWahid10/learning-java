package BeginwithJava;

import java.util.Scanner;

public class Practice3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a lb: ");
		int lb = sc.nextInt();
		System.out.println("Input a ub: ");
		int ub = sc.nextInt();
		
		if(lb<ub) {
			for(int i=lb;i<(ub+1);i++) {
				System.out.println(i);
			}
			
		}else {
			System.out.print("Wrong input.");

		}
		
	}

}
