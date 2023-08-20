package javatpoint;

public class BufferAndBuilderTest {
	public static void main(String args[]) {
//BufferExample		
		StringBuffer buff = new StringBuffer("HELLO");
		buff.append("JAVA");
		System.out.println(buff);
//builderExample
		StringBuilder buil = new StringBuilder("hello");
		buil.append("java");
		System.out.println(buil);
		
	}

}
