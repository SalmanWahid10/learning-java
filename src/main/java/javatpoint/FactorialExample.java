package javatpoint;

public class FactorialExample {
	public static void main(String args[]) {
		int i, fact=1;
		int num=4;
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+ " is: "+fact);
	}

}
