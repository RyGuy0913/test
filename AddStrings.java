/*
 * Ryan Anderson
 * Chapter 2
 * Program 11
 */
public class AddStrings {
	private String first, middle, last;
	private int c, f, m;
	
	public AddStrings() { //default constructor, which sets first and last to their default values
		first = null;
		middle = null;
		last = null;
	}
	
	public AddStrings(String one, String two ,String three) { //allows the strings to be set when instantiating AddStrings as an object
		first = one;
		middle = two;
		last = three;
	}
	
	public void setStrings(String one, String two ,String three) { //allows the strings to be changed later on instead of using the original strings from the object creation
		first = one;
		middle = two;
		last = three;
	}
	
	public String add() { //combines the strings first and last
		return first + " " + middle + " " + last;
	}
	
	public int findLength() { //finds the length of first and last by using .length(), and adds them together
		return first.length() + middle.length() + last.length();
	}

	public int findSLength() {
		return add().length();
	}
	
	public int findC() {
		return add().indexOf('c');
	}
	
	public int findF() {
		return add().indexOf('f');
	}
	
	public int findM() {
		return add().indexOf('m');
	}
	
	public void findVar(int findC, int findF, int findM) {
		c = findC;
		f = findF;
		m = findM;
	}
	
	public String printC() {
		if(c <= 0) {
			return ("the letter \"c\" does not exist");
		}
		else {
			return ("the letter \"c\" appears at index" + findC()); 
		}
	}
	
	public String printF() {
		if(c <= 0) {
			return ("the letter \"f\" does not exist");
		}
		else {
			return ("the letter \"f\" appears at index" + findF()); 
		}
	}

	public String printM() {
		if(c <= 0) {
			return ("the letter \"m\" does not exist");
		}
		else {
			return ("the letter \"m\" appears at index" + findM()); 
		}
	}
	
	public String toString() {
		return "Here is the \"sum\" of the words " + add() + 
				".\nThe length of the name \"" + add() + "\" is " + findLength() + ".\n" + 
				"The length of the string is " + findSLength() + ".\n" + printC() + ", " + printF() + ", and " + printM() + ".";
	}
	
	
	
	public static void main(String args[]) { //prints toString, and carries out all of the other methods
		AddStrings test = new AddStrings("Maria", "Martha", "Sanchez");
		test.add();
		test.findLength();
		test.toString();
		test.findSLength();
		test.findC();
		test.findF();
		test.findM();
		System.out.println(test.toString());
		System.out.println("\n");
		test.setStrings("John", "Ralph", "Anderson");
		test.add();
		test.findLength();
		test.toString();
		test.findSLength();
		test.findC();
		test.findF();
		test.findM();
		System.out.print(test.toString());
	}
}