package Day_19StringClass;

import java.util.Scanner;

public class Task_For_Length {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your firstname");
		String firstName=scan.nextLine();
		System.out.println("Enter your surname");
		String surName=scan.nextLine();
		System.out.println("character count of your firstname = "+firstName.length());
		System.out.println("character count of your surname = "+surName.length());
		System.out.println("total characters count =  "+(firstName.length()+surName.length()));

	}

}
