package Day_19StringClass;

public class Task_78CountNumbers {

	public static void main(String[] args) {
		String word="abcabqcabc";
		char myChar='q';
		int counter=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==myChar) {
				counter++;
			}
		}
		
		System.out.println("Number of "+myChar+" in this string is: "+counter);
		
	}

}
