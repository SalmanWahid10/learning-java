package javatpoint;

public class TestStudent3 {
	public static void main(String args[]) {
		StudentS s1 = new StudentS();
		StudentS s2 = new StudentS();
		
		s1.id = 101;
		s1.name = "Salman";
		s2.id = 102;
		s2.name = "Wahid";
		
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);
	}

}
