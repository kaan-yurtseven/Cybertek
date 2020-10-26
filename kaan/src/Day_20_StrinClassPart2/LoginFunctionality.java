package Day_20_StrinClassPart2;

import java.util.Scanner;

public class LoginFunctionality {

	public static void main(String[] args) {
		
		
		String username="kaan";
		String password="12345";
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your username");
		String givenUsername=scan.nextLine();
		System.out.println("Please enter your password");
		String givenPassword=scan.nextLine();
		
		
		if(givenUsername.equals("")&&givenPassword.equals("")) {
			System.out.println("Username and password Fields cannot be empty");
		}else if(!givenUsername.equals("")&&givenPassword.equals("")) {//if you want to negative value you must to put there !.
			System.out.println("password cannot be empty");
		}else if(givenUsername.equals("")&&!givenPassword.equals("")){
			System.out.println("username cannot be empty");
		}else if(!givenUsername.equals(username)||!givenPassword.equals(password)) {
			System.out.println("User name or password invalid. please verify");
		}else if(givenUsername.equals(username)&&givenPassword.equals(password)) {
			System.out.println("User logged in succesfuly");
		}
		
		
		
		
		
	}

}
