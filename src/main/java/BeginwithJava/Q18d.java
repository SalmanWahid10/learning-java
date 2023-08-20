package BeginwithJava;

public class Q18d {
	public static void main(String args[]) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int k=1;k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int l=1; l<i; l++) {
				System.out.print("*");
			}
			
			
//			for(int l=row;l>row-i+1;l--) {
//				System.out.print("*");
//			}
			System.out.println();
		}
	}

}
