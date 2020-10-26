package Lab1;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Write your speed:");
		int speed=scan.nextInt();
		System.out.println("Today, is your birthday?");
		String birthday=scan.next();
		if(birthday.equalsIgnoreCase("no")) {
			speed=speed;
		}else {
			speed-=5;
		}
	ticket(speed);
	
	}

	public static void ticket(int x) {
		if((x>=0)&(60>=x)) {
			System.out.println(0);
		}else if((x>60)&(x<=80)) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
		
	}

}
