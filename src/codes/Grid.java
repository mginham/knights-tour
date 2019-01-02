package codes;

import java.util.Scanner;

public class Grid {

	private static Node first;
	private int dimension = 0;
	private static int tileCounter = 0;
	private static int counter = 1;
	
	public Grid(int dimension) {
		this.dimension = dimension;
		
		if(dimension == 1)
			first = new Node();
		else if(dimension <= 0)
			first = null;
		else {
			first = new Node();
			
			Node temp;
			Node columnMarker = first;
			Node rowMarker = first;
			
			for(int x = 0; x < dimension-1; x++) {
				temp = new Node();
				tileCounter++;
				
				temp.setLeft(columnMarker);
				columnMarker.setRight(temp);
				
				columnMarker = temp;
			}
			
			for(int x = 0; x < dimension-1; x++) {
				temp = new Node();
				tileCounter++;
				
				temp.setUp(rowMarker);
				rowMarker.setDown(temp);
				
				rowMarker = temp;
				columnMarker = rowMarker;
				
				for(int y = 0; y < dimension-1; y++) {
					temp = new Node();
					tileCounter++;
					
					temp.setLeft(columnMarker);
					columnMarker.setRight(temp);
					temp.setUp(temp.getLeft().getUp().getRight());
					temp.getUp().setDown(temp);
					
					columnMarker = temp;
				}
			}
			
			columnMarker = first;
			rowMarker = first;
			
			while(rowMarker != null) {
				while(columnMarker != null) {
					if(columnMarker.getUp() != null && columnMarker.getUp().getUp() != null && columnMarker.getUp().getUp().getLeft() != null) { // position1
						columnMarker.setPosition1(columnMarker.getUp().getUp().getLeft());
					}
					if(columnMarker.getUp() != null && columnMarker.getUp().getUp() != null && columnMarker.getUp().getUp().getRight() != null) { // position2
						columnMarker.setPosition2(columnMarker.getUp().getUp().getRight());
					}
					if(columnMarker.getRight() != null && columnMarker.getRight().getRight() != null && columnMarker.getRight().getRight().getUp() != null) { // position3
						columnMarker.setPosition3(columnMarker.getRight().getRight().getUp());
					}
					if(columnMarker.getRight() != null && columnMarker.getRight().getRight() != null && columnMarker.getRight().getRight().getDown() != null) { // position4
						columnMarker.setPosition4(columnMarker.getRight().getRight().getDown());
					}
					if(columnMarker.getDown() != null && columnMarker.getDown().getDown() != null && columnMarker.getDown().getDown().getRight() != null) { // position5
						columnMarker.setPosition5(columnMarker.getDown().getDown().getRight());
					}
					if(columnMarker.getDown() != null && columnMarker.getDown().getDown() != null && columnMarker.getDown().getDown().getLeft() != null) { // position6
						columnMarker.setPosition6(columnMarker.getDown().getDown().getLeft());
					}
					if(columnMarker.getLeft() != null && columnMarker.getLeft().getLeft() != null && columnMarker.getLeft().getLeft().getDown() != null) { // position7
						columnMarker.setPosition7(columnMarker.getLeft().getLeft().getDown());
					}
					if(columnMarker.getLeft() != null && columnMarker.getLeft().getLeft() != null && columnMarker.getLeft().getLeft().getUp() != null) { // position8
						columnMarker.setPosition8(columnMarker.getLeft().getLeft().getUp());
					}
					
					columnMarker = columnMarker.getRight();
				}
				
				rowMarker = rowMarker.getDown();
				columnMarker = rowMarker;
			}
		}
	} // end constructor
	
	public static void display() {
		Node temp = first;
		Node rowMarker = first;
		
		while(temp != null) {
			while(temp != null) {
				if(temp.getData() > 99) {
					System.out.print(temp.getData() + " ");
				}
				else if(temp.getData() > 9 || temp.getData() < 0) {
					System.out.print(temp.getData() + "  ");
				}
				else {
					System.out.print(temp.getData() + "   ");
				}
				
				temp = temp.getRight();
			}
			
			System.out.println();
			rowMarker = rowMarker.getDown();
			temp = rowMarker;
		}
		
		System.out.println("=============================");
	} // end display
	
	public static void initiateTour() {
		Node start = first;
		
		tour(start.getRight().getRight());
	} // end initiateTour
	
	public static void tour(Node temp) {
		temp.setData(counter);
		
		if (counter == 64)
		{
			System.out.println("Solution!");
			display();
		}
		
		counter++;
		
		if(counter < 65) {
			if(temp.getPosition1() != null && temp.getPosition1().getData() == 0) {
				tour(temp.getPosition1());
			}
			if(temp.getPosition2() != null && temp.getPosition2().getData() == 0) {
				tour(temp.getPosition2());
			}
			if(temp.getPosition3() != null && temp.getPosition3().getData() == 0) {
				tour(temp.getPosition3());
			}
			if(temp.getPosition4() != null && temp.getPosition4().getData() == 0) {
				tour(temp.getPosition4());
			}
			if(temp.getPosition5() != null && temp.getPosition5().getData() == 0) {
				tour(temp.getPosition5());
			}
			if(temp.getPosition6() != null && temp.getPosition6().getData() == 0) {
				tour(temp.getPosition6());
			}
			if(temp.getPosition7() != null && temp.getPosition7().getData() == 0) {
				tour(temp.getPosition7());
			}
			if(temp.getPosition8() != null && temp.getPosition8().getData() == 0) {
				tour(temp.getPosition8());
			}
		}
		
		temp.setData(0);
		counter--;
		
		//display();
	} // end tour
	
} // end class Grid
