package BeginwithJava;

public class Q18f {
	public static void main(String args[]) {
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=(row-i)*2;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(" " + k);
			}
			for(int l=2;l<=i;l++) {
				System.out.print(" " + l);
			}
			System.out.println();
		}
		
			}

}
