package Lab1;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Give me a numbers: ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		love6(x,y);
	}

	public static void love6(int num1,int num2) {
		if((num1==6)|(num2==6)|(num1+num2==6)|(num1-num2==6)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
