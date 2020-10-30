package com.salmanwahid.learningjava;
//Demonstrate lifetime of a variable.
class VarInitDemo{
  public static void main(String args[]) {
    int x;
	
	for(x = 0; x < 3; x++) {
	  int y = -1; // y initialized each time block is entered
	  System.out.println("y is: " + y) ; // this always print -1
	  y = 100;
	  System.out. println("y is now: " + y) ;
	}
  }
}