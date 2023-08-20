package BeginwithJava;

import java.util.Scanner;

public class Practice4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input lb: ");
		int lb = sc.nextInt();
		System.out.println("Input ub: ");
		int ub = sc.nextInt();
		
		if(lb>ub) {
			for(int i=ub;i<=lb;i++) {
				System.out.println(i);
			}
		} 
		else if(lb<ub) {
			for(int j=lb;j<=ub;j++ ) {
				System.out.println(j);
			}
		}
		
	}

}
