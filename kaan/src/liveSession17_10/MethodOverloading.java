package liveSession17_10;

public class MethodOverloading {

	public static void main(String[] args) {
		//Method overloading, reusing the name of the method with different parameter list
		//name+parameter list=method signature
		//valid overloading : same name different parameter list(count or data type)
		byte b=100;
		addNumbers((byte) 100);
		addNumbers(100);
		addNumbers(100,200);
		addNumbers(100d,200d);
		addNumbers(100,200,300);
	}
	public static void addNumbers(byte num) {
		System.out.println("addNumbers(byte num) being called with "+ num) ;
		}
//	addNumbers that has 1 i int parameter:
	// it will add 10 to the number provided and print
public static void addNumbers(int num) {
	System.out.println("the result is "+(num+10));
}
//addNumbers that has 2 i int parameter:
// it will add these two numbers and print
public static void addNumbers(int num1, int num2) {
	System.out.println("addNumbers(int num1, int num2) the result is "+(num1+num2));
}
	
//addNumbers that has 2 i double parameter:
// it will add these two numbers and print
public static void addNumbers(double num1, double num2) {
	System.out.println("addNumbers(double num1, double num2)the result is "+(num1+num2));
}
	

//	addNumbers that has 3 i int parameter:
	// it will add these two numbers and print 
public static void addNumbers(int num1, int num2,int num3) {
	System.out.println("addNumbers(int num1, int num2,int num3)the result is "+(num1+num2+num3));
}


}
