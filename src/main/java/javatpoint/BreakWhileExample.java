package javatpoint;

public class BreakWhileExample {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i==6) {
				i++;
				break;
			}
			System.out.println(i);
			i++;
		}
	}

}
