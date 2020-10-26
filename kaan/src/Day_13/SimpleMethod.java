package Day_13;

public class SimpleMethod {

	public static void main(String[] args) {
		
		System.out.println("Hello from main method");
		displayMessage();//compiler come back and continue there.
		System.out.println("Back in the main method");
	
	}
	public static void displayMessage() {
		System.out.println("Hello from the method");
	
	
	}
	
}
