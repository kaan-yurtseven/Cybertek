package Day_19StringClass;

import java.util.Scanner;

public class EmojiCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your emoji");
		String emoji=scan.nextLine();
			if(emoji.length()!=2) {
				System.out.println("Invalid emoji!!!");
					return;//stop the execution
			}
			
			char first=emoji.charAt(0);
			char second=emoji.charAt(1);
			
		if(first==':') {
			if(second==')') {
				System.out.println("Smile");
			}else if(second=='(') {
				System.out.println("Sad");
				
			}else if(second=='/') {
				System.out.println("upset");
			}else if(second=='p'){
				System.out.println("playful");
				
			}else {
				System.out.println("Unknown emoji!!!");
			}
			
		}else if(first==';') {
			if(second==')') {
				System.out.println("Wink");
			}else if(second=='0') {
				System.out.println("Suprised");
			}else {
				System.out.println("Unknown emoji!!!");
			}
		}else {
			System.out.println("Invalid emoji!!");
		}

	}

}
