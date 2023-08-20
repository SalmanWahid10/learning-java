package javatpoint;

public class StringReplaceAllExample1 {
	public static void main(String args[]) {
		String str = "Salman";
		System.out.println(str);
		
		String regex = "";
		str = str.replaceAll(regex, " ");
		
		System.out.println(str);
	}

}
