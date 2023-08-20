package BeginwithJava;

import java.util.Scanner;

public class Practice2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int m = n < 0 ? -1 * n : n;
		for(int i=1;i<=m;i++) {
			if(n<0) {
				System.out.print(" -"+i);
			}else {
				System.out.print(" "+i);
			}
		}
		
	}

}
