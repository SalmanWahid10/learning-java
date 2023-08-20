package onlineVideos;

class Calculator {
	public int add(int i, int j) {
		return i+j;
	}
}
class CalAdv extends Calculator {
	public int sub(int i, int j) {
		return i-j;
	}
}
class CalVeryAdv extends CalAdv {
	public int multi(int i, int j) {
		return i*j;
	}
}


public class InheritanceDemo {
	public static void main(String args[]) {
		
		CalVeryAdv calc = new CalVeryAdv();
		int result1 = calc.add(3, 7);
		int result2 = calc.sub(13, 3);
		int result3 = calc.multi(2, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
