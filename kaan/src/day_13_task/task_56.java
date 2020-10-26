package day_13_task;

import java.util.Scanner;

public class task_56 {

	public static void main(String[] args) {
		convertKM(); 
		convertKM(); 
		convertKM(); 
		convertKM(); 
		convertKM(); 
		
	}
	public static void convertKM() {
System.out.println("Enter your km value:");
		Scanner scan=new Scanner(System.in);
		double km=scan.nextDouble();
		double mile;
		mile=km*0.62137;
		System.out.println(mile+"mile = "+km+" km");
	}
	
}
