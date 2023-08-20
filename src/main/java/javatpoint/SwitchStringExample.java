package javatpoint;

public class SwitchStringExample {
	public static void main(String[] args) {
		String levelString = "Expert";
		int level = 3;
		switch(levelString) {
		case "Expert": level = 1;
		break;
		case "Intermediate": level = 2;
		break;
		case "Beginner": level = 3;
		break;
		default: level = 0;
		break;
		}
		System.out.println("Your Level is: "+level);
	}

}
