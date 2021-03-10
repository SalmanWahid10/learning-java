package fifthchapter;

public class ShowBitsDemo {
	public static void main(String args[]) {
		ShowBits b = new ShowBits(8);
		ShowBits i = new ShowBits(32);
		ShowBits li = new ShowBits(64);
		System.out.println("123 in binary: ");
		b.show(123);
		
		System.out.println("\n87987 in binary: ");
		i.show(87987);
		
		System.out.println("\n237658768 in binary: ");
		li.show(237658768);
		
		System.out.println("\nLow order 8 bits of 87987 in binary: ");
		b.show(87987);
	}

}