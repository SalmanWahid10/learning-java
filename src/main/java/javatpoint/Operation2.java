package javatpoint;
//Another example of call by value
public class Operation2 {
	int data = 50;
	void change(Operation2 op) {
		op.data = op.data+100;
	}
	public static void main(String args[]) {
		Operation2 op = new Operation2();
		System.out.println("before change "+op.data);
		op.change(op);
		System.out.println("after change "+op.data);
	}

}
