package BeginwithJava;

public class Practice6 {
	public static void main(String args[]) {
		int i,j;
		for(i=4;i>=0;i-=2) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
				if(j%2==0) {
					System.out.print("1");
				} else {
					System.out.print("2");
				}
			}
			System.out.println();
		}
		
		
	}

}
