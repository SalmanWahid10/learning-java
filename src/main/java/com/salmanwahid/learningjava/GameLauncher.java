package com.salmanwahid.learningjava;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isright = false;
		boolean p2isright = false;
		boolean p3isright = false;
		
		int targetNum = (int) (Math.random()*10);
		System.out.println("I am thinking of a num between 0 and 9...");
		while(true) {
			System.out.println("Num to guess is " + targetNum);
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.num;
			System.out.println("Player one guessed " + guessp1);
			guessp2 = p2.num;
			System.out.println("Player two guessed " + guessp2);
			guessp3 = p3.num;
			System.out.println("Player three guessed " + guessp3);
			
			if(guessp1==targetNum) {
				p1isright = true;
			}
			if(guessp2==targetNum) {
				p2isright = true;
			}
			if(guessp3==targetNum) {
				p3isright = true;
			}
			if(p1isright || p2isright || p3isright) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isright);
				System.out.println("Player two got it right? " + p2isright);
				System.out.println("Player three got it right? " + p3isright);
				System.out.println("Game is over...");
				break;
			}else {
				System.out.println("Player will have to try again.");
			}
		}
	}
}
public class Player {
	int num = 0;
	public void guess() {
		num = (int) (Math.random()*10);
		System.out.println("I am guessing " + num);
	}
}

public class GameLauncher {
	public static void main(String args[]) {
		
		GuessGame game = new GuessGame();
		game.startGame();
	}

}
