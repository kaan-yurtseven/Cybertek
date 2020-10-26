package Day_13;

public class LoopCallMethods {

	public static void main(String[] args) {
		
		System.out.println("Hello from the main method");
		for(int i=0;i<5;i++) {
			displayMassage();
			System.out.println("Back in the main method");
		}
	
	}

	public static void displayMassage() {
		
System.out.println("Hello from displayMassage method");
		
	}
	
	
}
