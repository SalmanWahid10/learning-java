package chatcreat;

import java.util.Scanner;

public class Four {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi...");
		
		String a = sc.nextLine();
		System.out.println("My name is Devid..Nice to meet you.");
		
		String b = sc.nextLine();
		System.out.println("BTW what is your nane?");
		
		String name = sc.nextLine();
		System.out.println("Can i seat here?");
		
		String v = sc.nextLine();
		if(v.contains("yes")) {
			System.out.println("Thank u... :)");
		} else if(v.contains("no")) {
			System.out.println("Ok ok . No problem..");
		} else {
			System.out.println("Ohh its ok.");
		}
		System.out.println("So " + name + ", What do you do for a living?");
		
		String c = sc.nextLine();
		if(c.contains("teacher")) {
			System.out.println("Teaching is a good profession.");
		} else if(c.contains("student")) {
			System.out.println("Same here, am also a student.");
		} else if(c.contains("doctor")) {
			System.out.println("Very nice...");
		} else if(c.contains("engineer")) {
			System.out.println("Very good...");
		} else {
			System.out.println("You need to do something good...");
		}
		
		String d = sc.nextLine();
		System.out.println(" It has been really nice talking to you.");
		String e = sc.nextLine();
		
		
		
		
	}

}
