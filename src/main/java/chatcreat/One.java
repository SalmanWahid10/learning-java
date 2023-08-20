package chatcreat;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi...");
		
		String a = sc.nextLine();
		System.out.println("What is your name?");
		String b = sc.nextLine();
		
		System.out.println("Ram ki tmr choto vai?");
		String c = sc.nextLine();
		if(c.contains("haa")) {
			System.out.println("Or sathe amra jogajog ache.");
		} else if(c.contains("na")) {
			System.out.println("O achha.");
		} else {
			System.out.println("Dekhe ekerkm laglo tai bllm.");
		}
		System.out.println("Tmr boyos koto?");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("Onk boro hye gecho to..");
		}else if(age==18) {
			System.out.println("Vote deowar boyos hye geche to tahle :)");
		}else {
			System.out.println("Valo kre porasona koro choto acho ekhno..");
		}
		System.out.println("Thk ache thako abr pore dekha hbe. Bye..");
		String d = sc.nextLine();

	}

}
