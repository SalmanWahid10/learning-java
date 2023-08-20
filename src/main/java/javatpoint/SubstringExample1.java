package javatpoint;

public class SubstringExample1 {
	public static void main(String args[]) {
		String str[] = {"Praveen Kumar",
				"Yuvraj Singh",
				"Harbhajan Singh",
				"Gurjit Singh",
				"Virat Kohli",
				"Rohit Sharma",
				"Sandeep Singh",
				"Milkha Singh"
		};
		String surName = "Singh";
		int surNameSize = surName.length();
		int size = str.length;
		
		for(int i=0;i<size;i++) {
			int length = str[i].length();
			String subStr = str[i].substring(length-surNameSize);
			if(subStr.equals(surName)) {
				System.out.println(str[i]);
			}
		}
		
	}

}
