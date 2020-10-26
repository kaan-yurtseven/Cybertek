package liveSession17_10;

public class MethodCalIInDifferentClass {

	public static void main(String[] args) {
//		how do I reuse the static methods I created in other class
//		you can call static methods you creatid using 
//		ClassName.methodNames(pass arguments if needed)
		System.out.println("Program started");
		MethodPractice.sayHello();
//		task:call the rest of the methods here to test it out
		MethodPractice.sayHelloTo("Kaan");
		MethodPractice.sayHelloWithFullName("kaan", "yurtseven");
		System.out.println("Program ended");
		
	}

}
