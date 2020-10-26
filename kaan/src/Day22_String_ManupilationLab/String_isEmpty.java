package Day22_String_ManupilationLab;

public class String_isEmpty {

	public static void main(String[] args) {
		
		String userName =" ";
		String password="";
		if(userName.isEmpty()) {//for isEmpty String must be length 0.
			System.out.println("Username field can not be empty");
			
		}else {
			System.out.println("Username is not empty");
		}
		
		if(userName.isEmpty()|| password.isEmpty()) {
			System.out.println("username and password can not be emoty");
			
		}else {
			System.out.println("username and password is not empty");
		}
		
		userName.isBlank();//String is must be length 0 or put the space for isBlank.
	}

}
