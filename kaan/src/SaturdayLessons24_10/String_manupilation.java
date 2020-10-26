package SaturdayLessons24_10;

public class String_manupilation {

	public static void main(String[] args) {
		
		String s1="abc";//It is literal.It is in the string pool
		String s2=new String("abc");// It is using new keyword. It is in the new object.
		String s3="abc";
		
		System.out.println(s1==s3);//This is checking if s1 and s3 have same adress
									//Meaning do they point to same object
		System.out.println(s1==s2);//they are different object. Because of that it is false
									//"==" is meaning to check same adress
		
		System.out.println(s1.equals(s2));// This one is checking whether string objects s1 and s2 pointing has same content!
		
//		s2=s1;//Trick
//		
//		System.out.println(s2==s3);// true
//		s1=s2;
//		System.out.println(s1==s3);//false
		
//		String s are objects
//		They are stored in the heap
//		String pool: a very special area in the heap to store UNIQUE string literal
		
		
		
		
		
		
		
		
	}

}
