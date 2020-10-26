package day_14;

public class passByvalue {

	public static void main(String[] args) {
		int age=7;
		pass(age);
		System.out.println(age);
//		System.out.println(x); ıt doesnt compile. This variable is a local variable.
	}
	public static void pass(int x) {
		
		x=x+3;
		System.out.println(x);
		//age value is same. it s not different. It is a pass by value.
	
	}
	
}
	
