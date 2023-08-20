package javatpoint;

class JavaTpoint {
	private int i;
	JavaTpoint(){}
		JavaTpoint(int i) {
			this.i = i;
		}
		public int getValue() {
			return i;
		}
		public void setValue(int i) {
			this.i = i;
		}
		public String toString() {
			  return Integer.toString(i);
		}
}

public class TestJavaTpoint {
	public static void main(String args[]) {
		JavaTpoint j = new JavaTpoint(10);
		System.out.println(j);
		
	}

}
