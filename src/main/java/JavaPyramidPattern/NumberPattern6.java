package JavaPyramidPattern;

public class NumberPattern6 {
	public static void main(String args[]) {
		int row = 5;
		int count = 1;
		int i,j;
		for(i=row;i>=1;i--) {
			for(j=1;j<=i*2;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=row;j++) {
				System.out.print(j+ " ");
			}
			for(j=row-1;j>=i;j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
			count++;
		}
	}

}
