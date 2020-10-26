package Day_13;

public class PassArg {

	public static void main(String[] args) {
		int x = 1;
		double y=10.45;
		displayValue((int) y);
		displayValue(10);
		displayValue(x);
		displayValue(x*4);
		login("kaan");
	}

	public static void displayValue(int num) {
			System.out.println("The value is "+num);
	}
	
	public static void login(String a) {
		System.out.println(a);
	}
	//compiler can convert smaller datatype to bigger datatype
//for example byte---int,short---int.  but dont forget you miss any information.
	
}
