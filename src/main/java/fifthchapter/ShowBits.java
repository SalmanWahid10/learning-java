package fifthchapter;

public class ShowBits {
	public static void main(String args[]) {
		int t;
		byte val;
		val = 123;
		for(t=128;t>0;t=t/2) {
			if((val & t) != 0)
				System.out.print("1 ");
			else System.out.print("0 ");
		}
	}


int numbits;
ShowBits(int n) {
	numbits = n;
}
void show(long val) {
	long mask = 1;
	mask <<= numbits-1;
	int spacer = 0;
	for(; mask != 0;mask>>>=1) {
		if((val & mask) != 0)
			System.out.print("1 ");
		else System.out.print("0 ");
		spacer++;
		if((spacer % 8) == 0) {
			System.out.print(" ");
			spacer = 0;
		}
	}
	System.out.println();
}
}
