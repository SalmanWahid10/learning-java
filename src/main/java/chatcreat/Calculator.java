package chatcreat;

import java.util.Scanner;

class Cal {
	public int add(int i, int j) {
		System.out.println(i+j);
		return (int) (i+j);
	}
	public int sub(int i, int j) {
		System.out.println(i- j);
		return (int) (i-j);
	}
	public int multi(int i, int j) {
		System.out.println(i*j);
		return (int) (i*j);
	}
	public int div(int i, int j) {
		System.out.println(i/j);
		return (int) (i/j);
	}
}



public class Calculator {
	public static void main(String args[]) {
		String yn;
		do {
			Cal obj = new Cal();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("It's a Calculator, Lets START...");
			System.out.println("Enter your first number ");
			
			int a = sc.nextInt();
			System.out.println("Enter your second number ");
			int b = sc.nextInt();
			
			System.out.println("Enter your symbol");
			String symbol = sc.next();
			
			if(symbol.equals("+")) {
				System.out.println("Addition is: ");
				System.out.println(obj.add(a, b));
			}else if(symbol.equals("-")) {
				System.out.println("Subtraction is: ");
				System.out.println(obj.sub(a, b));
			} else if(symbol.equals("*")) {
				System.out.println("multiplication is: ");
				System.out.println(obj.multi(a, b));
			} else if(symbol.equals("/")) {
				System.out.println("Division is: ");
				System.out.println(obj.div(a, b));
			} else {
				System.out.println("Use valid number...");
			}
			
			System.out.println("Do you continue(Press y for YES and n For No)");
			yn = sc.next();
			
		}while(yn.equals("y")||yn.equals("Y"));
	}
			

}
