package chatcreat;

import java.util.Scanner;

public class Two {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kire kmn achis?");
		
		String a = sc.nextLine();
		if(a.contains("valo")) {
			System.out.println("Bah valo thklei valo.");
		} else if(a.contains("cholche")) {
			System.out.println("Sb thk thak to?");
		} else {
			System.out.println("Vlo kre thak.");
		}
		String b = sc.nextLine();
		String x = sc.nextLine();
		System.out.println("Sunlm tui nki gari kinechis?");
		String c = sc.nextLine();
		
		System.out.println("Ki colour?");
		String d = sc.nextLine();
		
		if(d.contains("blue")) {
			System.out.println("Ei colour ta dkhte valo lage..");
		} else if(d.contains("red")) {
			System.out.println("Red kno nili, khub chokhe lage. Red amr pochondo na..");
		} else if(d.contains("black")) {
			System.out.println("Valo krechis..Black sb smy best..");
		} else {
			System.out.println("uncommon colour..");
		}
		System.out.println("Borolok er boro boro byapr. :) :)");
	}

}
