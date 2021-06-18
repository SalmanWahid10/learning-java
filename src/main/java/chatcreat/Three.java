package chatcreat;

import java.util.Scanner;

public class Three {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kire salman achis?");
		 String a = sc.nextLine();
		 System.out.println("Tr to kno khbr e nai..");
		 System.out.println("Pora koto dur egolo?");
		 System.out.println("Kotota hyeche?");
		 
		 String b = sc.nextLine();
		 if(b.contains("motamuti")) {
			 System.out.println("Kno kothao kno prblm?");
		 } else if(b.contains("onktai")) {
			 System.out.println("tara tari sesh kr eta..");
		 } else {
			 System.out.println("Tui abr faki dichhis? tr barite abr blte hbe.");
		 }
		 String c = sc.nextLine();
		 if(c.contains("achha")) {
			 System.out.println("Eta sesh hole notun ekta dbo.");
		 } else if(c.contains("bolona")) {
			 System.out.println("Tahle valo kre por. Job pete hbe.");
		 } else {
			 System.out.println("Sesh hole amy knock dis.");
		 }
		 
		 
	}

}
