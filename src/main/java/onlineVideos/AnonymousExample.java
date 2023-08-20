package onlineVideos;

public class AnonymousExample {
	public static void main(String args[]) {
		A obj = new A() {
			public void show() {
				System.out.println("I'm the best");
			}
		};
		obj.show();
	}

}
class A {
	public void show() {
		System.out.println("in A show");
	}
}
