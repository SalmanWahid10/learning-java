package JavaPyramidPattern;

public class NumberPattern1 {
	public static void main(String args[]) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=0;j<row-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<i;k++) {
				System.out.print(k);
			}
			for(int l=i;l>=1;l--) {
				System.out.print(l);
			}
			System.out.println("\n");
		}
	}

}
