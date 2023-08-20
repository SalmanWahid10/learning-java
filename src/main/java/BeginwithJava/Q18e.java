package BeginwithJava;

public class Q18e {
	public static void main(String args[]) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int k=1;k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
					System.out.print(i);

			}
			for(int l=2;l<=i;l++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
