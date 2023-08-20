package javatpoint;

public class TestAccount {
	public static void main(String args[]) {
		Account a1 = new Account();
		a1.insert(918273645, "Salman", 5800);
		a1.display();
		a1.checkBalance();
		a1.deposit(2000);
		a1.checkBalance();
		a1.withdraw(1800);
		a1.checkBalance();
	}

}

class Account {
	int acc_no;
	String name;
	Float amount;
	void insert(int a, String n,float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	void deposit(float amt) {
		amount = amount+amt;
		System.out.println(amt+ " deposited.");
	}
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insufficient Balance.");
		}else {
			amount = amount-amt;
			System.out.println(amt + " withdrawn");
		}
	}
	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}
	void display() {
		System.out.println(acc_no+" "+name+" "+amount );
	}
}