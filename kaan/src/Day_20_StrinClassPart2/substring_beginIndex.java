package Day_20_StrinClassPart2;

public class substring_beginIndex {
	
	public static void main(String[] args) {

	//substring(beginIndex) ==> method returns string's substring that begins with the character at the specified beginIndex and extends to the end of the string
	//substring(beginIndex,endIndex)==>	method returns string's substring that begins at the specified beginIndex and extends to the character at index endIndex. 
//			Note the character at endIndex is not part of the substring
	String s1="JavaScript";
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(s1.length()-4));
		System.out.println(s1.substring(3));
		System.out.println(s1);
		System.out.println(s1.substring(0, 6));
	System.out.println("-------------------------");
	String str="Programming is fun";
		System.out.println(str.substring(1, 4));
		System.out.println(str.substring(2, 3));//endIndex does not include.
		System.out.println(str.substring(12, str.length()-4));
		
		System.out.println(str.substring(4, 4));//it s empty.
		
		
	String sentence="Java String Manipulation is fun!";
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.length());
		System.out.println(sentence.substring(5, sentence.length()-5));
		
	String chars="{{}}";
	String word="Automation";
		System.out.println(chars.substring(0,2).concat(word).concat(chars.substring(2)));
		
	
		
	}
	
}
