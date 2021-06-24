package onlineVideos;

class Abc {
	public int add(int ... n ) {
		int sum = 1;
		for(int i : n) {
			sum = sum * i;
		}
		return sum;
	}
}

public class VarargasDemo {
	public static void main(String args[]) {
		Abc obj = new Abc();
		System.out.println(obj.add(4,5,7,8,6));
	}

}
