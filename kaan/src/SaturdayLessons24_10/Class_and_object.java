package SaturdayLessons24_10;


public class Class_and_object {

	public static void main(String[] args) {
		
	//Computer class is blueprint for computer objects
//		Creating object using new keybord
	Computer c1=new Computer();
//	assigning value for each filed
	c1.brand="Apple";
	c1.price=1300;
	c1.screenSize=13;
	c1.screenSize=15;//reassigning the value
	System.out.println("Computer 1 brand is "+ c1.brand);
	System.out.println("Computer 1 price is "+c1.price);
	System.out.println("Computer 1 screenSize is "+c1.screenSize);
	System.out.println("-----------------------");
	
	Computer c2=new Computer();
	c2.brand="ASUS";
	c2.price=345;
	c2.screenSize=13;
	System.out.println("Computer 2 brand is "+ c2.brand);
	System.out.println("Computer 2 price is "+c2.price);
	System.out.println("Computer 2 screenSize is "+c2.screenSize);
	System.out.println("-----------------------");
	
	Computer c3=new Computer();
	c3.brand="ASUS";
	c3.price=345;
	c3.screenSize=13;
	System.out.println("Computer 3 brand is "+ c3.brand);
	System.out.println("Computer 3 price is "+c3.price);
	System.out.println("Computer 3 screenSize is "+c3.screenSize);
	System.out.println("-----------------------");
	
	//c2 and c3 are same value. but they have different memory in the heap.
	Computer c4=c1;
	
	System.out.println("Computer 4 brand is "+ c4.brand);
	System.out.println("Computer 4 price is "+c4.price);
	System.out.println("Computer 4 screenSize is "+c4.screenSize);
	System.out.println("-----------------------");
	
		c4.brand="HP";// SOOOO important.
		System.out.println(c4.brand+" "+c1.brand);
	System.out.println("-----------------------");
		
	Computer c5=new Computer();//important too.
	System.out.println(c5.brand+" "+c5.price+" "+c5.screenSize);
	
	System.out.println("-------------------");
	
	Computer c6=new Computer();
	c6=c5;   
	c5.brand="apple";
	System.out.println(c6.brand);
	
	
	
	
	}

}
