package JavaPyramidPattern;

public class NumberPattern5 {
	public static void main(String args[]) {
		int i,j,k,l = 1;
		int row = 10;
		for(i=1;i<row;i++) {
			for(j=1;j<=row;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++,l++) {
				System.out.print(l + " ");
			}
			System.out.println(" ");
		}
	}

}
