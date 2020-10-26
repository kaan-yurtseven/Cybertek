package Day_20_StrinClassPart2;

public class Day_19Summary {

	/*String : an object that represents sequences of char values.
	 *				 String,StringBuffer,StringBuilder.We are learning String now.
	 *
	 *java.lang package, we have to know that. taht is used to create a string objects.
	 *There are 2 ways to create String object.
	 *		String str="Apple";//LITERAL
	 *		String str=new String("Apple");//NEW KEYWORD	
	 *
	 *String pool:It consists of a collection of String objects, which are shared and reused among several string object references for same content.
	 * 
	 * STRING METHODS:
	 * 1)length();==> character's counts of String(including spaces)
	 * 			String str="Apple";		
	 * 			str.length();==>5
	 * 
	 * 2)charAt(indexNumber);==>returns a char value at given index numbers. Index numbers start from 0.Last character of index=length()-1.
	 * 			str.charAt(0);==>"A"
	 * 			str.charAt(4);==>"e"
	 * 
	 * 3)concat(String);==>Combines specified string at the end of this string.It returns combined string.
	 * 			str.concat("Eat")==>AppleEat
	 * 			String s2="It";
	 * 			str.concat(s2);==>AppleEatIt
	 * 	Immutable:String objects are immutable. means unmodifiable, or unchangeable.
	 * 		 Once string object is created, its data or state can not be changed but a new string object is created.
	 * 
	 * 4)contains();==> Searches the sequences of characters in the string. If it is found, returns true.
	 * 			String str="Apple";
	 * 			str.contains("A")==>true
	 * 
	 * 5)indexof("String")==> returns the index within the calling String of the first occurance of specified value,starting fromIndex. 
	 * 		Returns -1 if the value is not found
	 * 			String str="Hello kaan";
	 * 			int n=str.indexof("Hello");//0
	 * 
	 * 6)replace(oldChar,newChar)==> returns a string replacing all the old char to new char.
	 * 			String replaced = str.replace("Hello","Bye");//Bye kaan
	 * 
	 * 7)equals()===> compares two given string based on the content of the string
	 * 			String s1="Java";
	 * 			String s2="Java";
     *			String s3=new String("Java");
     *			s1.equals(s2);//True		s1==s2;//true
     *			s1.equals(s3);//True		s1==s3;//false
     *
     *8)equalsIgnoreCase===> there is the Ignore case.
     *			String s1="java";
     *			String s2="JaVa";
     *			s1.equalsIgnoreCase(s2);//true
     *
     *9)substring(beginIndex) ==> method returns string's substring that begins with the character at the specified beginIndex and extends to the end of the string
     *substring(beginIndex,endIndex)==>	method returns string's substring that begins at the specified beginIndex and extends to the character at index endIndex. 
	 *			Note the character at endIndex is not part of the substring. EndIndex does not include.
     * 			String str="Welcome to Java";
     * 			str.substring(11);//Java
     *10)substring(beginIndex,endIndex)==>nreturn string's substring that behinds at the specified beginIndex and extends to the character at index endIndex-1
     * 			str.substring(0,11);//Welcome to ."J does not include."
     * 
     *11)str.toLowerCase();//welcome to java
     *12)str.toUpperCase();//WELCOME TO JAVA
     *13)trim() ==> removes spaces from both ends of a string.//ONLY BEGİNNİNG AND END.
	 *  		String str="   Welcome to Java   ";
     *			str.trim();//Welcome to Java
     *
     *
     *
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
}
