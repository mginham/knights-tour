package codes;

public class Node {

	private int data;
	private Node up, down, left, right;
	private Node position1, position2, position3, position4, position5, position6, position7, position8;
	private static int counter;
	
	public Node() {
		counter++;
		this.data = 0;
		
		up = null;
		down = null;
		left = null;
		right = null;
		
		position1 = null;
		position2 = null;
		position3 = null;
		position4 = null;
		position5 = null;
		position6 = null;
		position7 = null;
		position8 = null;
	} // end constructor

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getUp() {
		return up;
	}

	public void setUp(Node up) {
		this.up = up;
	}

	public Node getDown() {
		return down;
	}

	public void setDown(Node down) {
		this.down = down;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Node getPosition1() {
		return position1;
	}

	public void setPosition1(Node position1) {
		this.position1 = position1;
	}

	public Node getPosition2() {
		return position2;
	}

	public void setPosition2(Node position2) {
		this.position2 = position2;
	}

	public Node getPosition3() {
		return position3;
	}

	public void setPosition3(Node position3) {
		this.position3 = position3;
	}

	public Node getPosition4() {
		return position4;
	}

	public void setPosition4(Node position4) {
		this.position4 = position4;
	}

	public Node getPosition5() {
		return position5;
	}

	public void setPosition5(Node position5) {
		this.position5 = position5;
	}

	public Node getPosition6() {
		return position6;
	}

	public void setPosition6(Node position6) {
		this.position6 = position6;
	}

	public Node getPosition7() {
		return position7;
	}

	public void setPosition7(Node position7) {
		this.position7 = position7;
	}

	public Node getPosition8() {
		return position8;
	}

	public void setPosition8(Node position8) {
		this.position8 = position8;
	}
	
} // end class Node
