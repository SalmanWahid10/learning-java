package javatpoint;

public class StringReplaceAllExample {
	public static void main(String args[]) {
		String s = "My name is Salman. My name is Wahid. My name is Chowdhury";
		String replace = s.replaceAll("is","was");
		System.out.println(replace);
	}

}
