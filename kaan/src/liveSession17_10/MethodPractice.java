package liveSession17_10;

public class MethodPractice {

	public static void main(String[] args) {
		
//		Method: reusable block of code with a name
//			optionally with parameters and return type.
		
		sayHello();
		sayHelloTo("Kaan and Tuğçe");
		sayHelloWithFullName("Kaan","YURTSEVEN");
	}
//	Method parameters only can be used inside method.
	
	public static void sayHelloWithFullName(String name,String name1) {
		
		System.out.println("Saying hello to "+name+" "+name1);
		
		
	}
	public static void sayHelloTo(String name) {
		System.out.println("Saying hello to "+name);
		
		
		
		
		
	}
	public static void sayHello() {
		
		System.out.println("Hello from Cybertek");
		System.out.println("Welcome to Cybertek");
		
	}
	
	
	
}
