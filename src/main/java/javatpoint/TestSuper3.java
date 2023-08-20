package javatpoint;

public class TestSuper3 {
	public static void main(String args[]) {
		DogC d = new DogC();
	}

}

class AnimalC {
	AnimalC(){
		System.out.println("animal is created");
	}
}
class DogC extends AnimalC {
	DogC(){
		super();
		System.out.println("dog is created");
	}
}