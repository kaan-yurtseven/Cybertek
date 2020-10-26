package SaturdayLessons24_10;

	public class Computer {
		double price ;
		int screenSize ;
		String brand ;
//open
//		any method is not static--known as instance method
//		to represent behavior object
		
	public void open() {
		System.out.println("Computer is opening");
}//if you write static you couldn't call the object
	public void displayInfo() {
		System.out.println("computer-price is "+price);
		System.out.println("computer-brand is "+brand);
		System.out.println("computer-screenSize is "+screenSize);
		
		
	}
	
}