package day_13_task;

public class Task_60 {

	public static void main(String[] args) {
		
		
		operator(41, 56, "=");
	}
	public static void operator(double num1,double num2,String operator) {
		double result;
		switch (operator){
			case "+":
				result=num1+num2;
				System.out.println(result);
				break;
			case"-":
				result=num1-num2;
				System.out.println(result);
				break;
			case "*":
				result=num1*num2;
				System.out.println(result);
				break;
			case "/":
				result=num1/num2;
				System.out.println(result);
				break;
				default:
					System.out.println("invalid!!");
			
		}
		
	}
}
