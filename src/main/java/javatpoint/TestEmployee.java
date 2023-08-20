package javatpoint;

public class TestEmployee {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.insert(101, "Salman", 2600);
		e2.insert(102, "Wahid", 2700);
		e3.insert(103, "Chowdhury", 2800);
		
		e1.display();
		e2.display();
		e3.display();
	}

}

class Employee {
	int id;
	String name;
	float salary;
	void insert(int i,String n, float s) {
		id = i;
		name = n;
		salary = s;
	}
	void display() {
		System.out.println(id+"  "+name+"  "+salary);
	}
}
