package Day_13;

public class PassingMultiplArgs {

	public static void main(String[] args) {
	
		
		showSum(21, 23);
		showSum(12, 321);
	}

	public static void showSum(int num1,int num2) {
		int sum= num1+num2;
		System.out.println(sum);
		System.out.println(num1+num2);
		
//		showSum(x); correct
//		showSum(int x);ERROR
//		showSum(double num1,num2){}ERROR
//		showSum(double num1,double num2){}correct
	}
	
	
}
