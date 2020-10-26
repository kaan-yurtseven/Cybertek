package Day_19StringClass;

public class vowel_String {

	public static void main(String[] args) {
		String str="Cybertek School";
	
		for(int i=0;i<str.length();i++) {
			char letter = str.charAt(i);
			if(letter=='a'||letter=='e'||letter=='o'||letter=='i'||letter=='u') {
				System.out.print(letter);
				if(i!=str.length()-2) {
					System.out.print(",");
				}
			}
			
		}
	}

}
