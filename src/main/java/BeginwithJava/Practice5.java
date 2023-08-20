package BeginwithJava;

public class Practice5 {
	public static void main(String args[]) {
		int i,j,k,l=1;
		int row=3;
		for(i=row;i>=1;i--) {
			for(j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<row+i-1;k++,l++) {
				System.out.print(l+ " ");
			}
			
			System.out.println();
		}
		
	}

}
