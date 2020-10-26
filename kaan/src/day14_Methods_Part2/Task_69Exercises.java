package day14_Methods_Part2;

import java.util.Scanner;

public class Task_69Exercises {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number:");
		int num=scan.nextInt();
		if(num==0||num==1) {
			System.out.println(num+" is not a prime number");
		}else if(isPrime(num)){
			System.out.println(num+" is a prime number");
			
		}else {
			System.out.print(num+" is not a prime number");
		}
	}

	public static boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<num;i++){
			if(num%i==0) {
				flag=false;
				break;
			}else {
				
			}
		}
		return flag;
	}

}
