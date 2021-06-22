package onlineVideos;

public class Continue_Break {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) { 
			if(i==5) {
				continue;
			}
			System.out.println("Value is "+i);
		}
		
			for(int j=1;j<=10;j++) { 
				if(j==5) {
					break;
				}
				System.out.println("Value is "+j);
			}
			
		}

	

	

}
