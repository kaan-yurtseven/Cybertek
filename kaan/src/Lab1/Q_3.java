package Lab1;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Give me a number: ");
	int num=scan.nextInt();
	vipNumbers(num);
	
	}

	public static void vipNumbers(int x) {
		if((x%11==0)|(x%11==1)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
		
	}

}
