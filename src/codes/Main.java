package codes;

public class Main {

	public static void main(String[] args) {
		int start = (int)(Math.random()*25+1);
		
		Grid board = new Grid(8);
		
		Grid.initiateTour();
		
		//board.display();
		
		System.out.println("Terminated");

	} // end main

} // end class Main
