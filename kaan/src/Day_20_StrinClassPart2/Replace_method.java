package Day_20_StrinClassPart2;

public class Replace_method {

	public static void main(String[] args) {
//		replace();==> method returns a string replacing all the old char or CharSequence to new char or CharSequence.
//		The original string will remain unchanged.
		String str= "Ebay is a verry good website";
		String replaced=str.replace("Ebay","Bestbuy");
		System.out.println(replaced);
		System.out.println(str);
		System.out.println("----------------------------------");
		
		
		String word="Moscow is a capital of Russia";
		System.out.println(word);
		word=word.replace("Moscow", "Bakü").replace("Russia", "Azerbaijan");
		System.out.println(word);
		String word1="Moscow is a capital of Russia of Russia";
		word1=word1.replace("Moscow", "Bakü").replace("Russia", "Azerbaijan");
		System.out.println(word1);
		
	}

}
