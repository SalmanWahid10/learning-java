package com.salmanwahid.learningjava;

class Movie {
	String title;
	String genre;
	int rating;
	
	void playIt() {
		System.out.println("Playing the movie");
	}
}
public class MovieTestDrive {
	public static void main(String args[]) {
		Movie one = new Movie();
		one.title = "Devdas";
		one.genre = "Romantic";
		one.rating = 8;
		Movie two = new Movie();
		two.title = "Force";
		two.genre = "Action";
		two.rating = 7;
		Movie three = new Movie();
		three.title = "Dhamaal";
		three.genre = "Comedy";
		three.rating = 9;
	}

}
