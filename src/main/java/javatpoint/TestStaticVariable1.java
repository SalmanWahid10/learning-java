package javatpoint;

public class TestStaticVariable1 {
	public static void main(String args[]) {
		StudentS1 s1 = new StudentS1(111,"Salman");
		StudentS1 s2 = new StudentS1(111,"Wahid");
//StudentS1.college = "XYZ";		
		s1.display();
		s2.display();
	}

}

class StudentS1 {
	int rollno;
	String name;
	static String college = "ITS";//static variable
	StudentS1(int r, String n){
		rollno = r;
		name = n;
	}
	void display() {
	System.out.println(rollno+" "+name+" "+college);
	}
}
