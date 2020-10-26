package Day_19StringClass;

public class Concat_method {

	public static void main(String[] args) {
//		concat() method: combines specified string at the end of this string.
//		It returns combined string. It is like appending another string
		
		String s1="Hello";
		String s2=" world";
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		System.out.println(s1.concat(" Kaan YK"));
		System.out.println(s1);
		s1=s1.concat(s2);//s1 changed value.
		System.out.println(s1);
		s1=s1.concat(" Kaan YK");
		System.out.println(s1);
		s1=s1.concat("123");// ıf you want to add digit, you must use "".Because compiler does not accept number.compiler only accept String.
		System.out.println(s1);
		s1=s1+4+5+6;//String+int=String. Compiler accepts this situation
		System.out.println(s1);
		s1=s1+true;
		System.out.println(s1);
		s2=s2.concat("-hey").concat("-how are you").concat("-good");
		System.out.println(s2);
		System.out.println(s3);
		s3=s1.concat(s2);
		System.out.println(s3);
		
		
		
		//Immutable String: In java, string objects are immutable.
//				Immutable simply means unmodifiable or unchangeable.
//		  Once string object is created its data or state can not be changed but a new string object is created	
		
		
		
		
		
	}

}
