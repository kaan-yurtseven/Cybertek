package day_13_task;

import java.util.Scanner;

public class Task_58 {

	public static void main(String[] args) {
		greaterNumber();
		
	}

	public static void greaterNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=scan.nextInt();
		System.out.println("Enter num2: ");
		int num2=scan.nextInt();
		String result=(num1>num2) ? "num1 is greater than num2":"num2 is equal or greater than num1";
		System.out.println(result);
		
		
				
	}

}
