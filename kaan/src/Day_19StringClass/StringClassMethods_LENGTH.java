package Day_19StringClass;

import java.util.Scanner;

public class StringClassMethods_LENGTH {

	public static void main(String[] args) {
		
//		1)length() method: returns count of total number of characters in the string including spaces.
		String name="Kaan YURTSEVEN";
		String str="";
		String name2="Tuğçe yurtseven";
		int x=name.length();
		
		System.out.println(str.length());
		System.out.println(name2.length());
		System.out.println(x);
		System.out.println(name.length());
		System.out.println("Enter your name");
		Scanner scan=new Scanner(System.in);
		String name3=scan.nextLine();
		System.out.println(name3.length());
		String str1=new String("kaan");
		System.out.println(str1.length());
		
	}

}
