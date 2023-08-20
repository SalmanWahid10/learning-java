package javatpoint;

class Account1 {
	private long acc_no;
	private String name,email;
	private float amount;
	
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}

public class TestEncapsulation1 {
	public static void main(String args[]) {
		Account1 ac = new Account1();
		ac.setAcc_no(983434732863L);
		ac.setName("Salman");
		ac.setEmail("salman100@gmail.com");
		ac.setAmount(834678f);
		
		System.out.println(ac.getAcc_no()+" "+ac.getName()+" "+ac.getEmail()+" "+ac.getAmount());
	}

}
