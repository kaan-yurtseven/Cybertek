package day14_Methods_Part2;

import java.util.Scanner;

public class FibonacciSeriesExmp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your number:");
		int num=scan.nextInt();
		int num1=1;
		int num2=0;
		for(int i=1;i<=num;i++) {
			System.out.print(num1+" ");
			int num3=num1+num2;
			num2=num1;
			num1=num3;
			
		}
	}

}
