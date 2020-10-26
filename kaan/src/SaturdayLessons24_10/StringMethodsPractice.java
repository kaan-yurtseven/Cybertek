package SaturdayLessons24_10;

public class StringMethodsPractice {

	public static void main(String[] args) {
		
		String message="Java is Awesome!!";
			int x=message.length();
			System.out.println("How many character's we have "+x);
			System.out.println("How many character's we have "+message.length());
		for(int i=0;i<x;i++) {
			System.out.print(message.charAt(i)+" ");
		}System.out.println();
		System.out.println("-------------------------------");
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
		System.out.println(message);//message does not change.String immutable.
		String changeMessage=message.toUpperCase();
		System.out.println(changeMessage);//message is same already. but we create new literal string.
		System.out.println("-------------------------------");
		
		
		
		
		
	}

}
