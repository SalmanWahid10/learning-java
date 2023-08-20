package javatpoint;

public class TestStudent4 {
	public static void main(String args[]) {
		Std s1 = new Std();
		Std s2 = new Std();
		s1.insertRecord(111,"Salman");
		s2.insertRecord(222,"Wahid");
		
		s1.displayInformation();
		s2.displayInformation();
		
	}

}

class Std {
	int rollno;
	String name;
	
	void insertRecord(int r,String n) {
		rollno = r;
		name = n;
	}
	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}
