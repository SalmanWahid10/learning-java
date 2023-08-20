package javatpoint;

class StudentN {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class TestEncapsulation {
	public static void main(String args[]) {
		StudentN s = new StudentN();
		s.setName("Salman");
		System.out.println(s.getName());
	}

}
