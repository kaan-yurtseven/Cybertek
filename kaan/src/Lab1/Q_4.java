package Lab1;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the temperature?");
		int degree=scan.nextInt();
		System.out.println("Is it summer now?");
		String summer=scan.next();
		deer(degree,summer);
	}

	public static void deer(int x,String y) {
		if(y.equalsIgnoreCase("yes")) {
			if((x>=60)&(x<=100)) {
			System.out.println("True");
			}else {
			System.out.println("False");
			}
		}else {
			if((x>=60)&(x<=90)) {
				System.out.println("True");
			}else {
			System.out.println("False");
			
			}
		}
		
	}

}
