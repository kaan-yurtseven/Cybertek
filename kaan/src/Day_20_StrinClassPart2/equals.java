package Day_20_StrinClassPart2;

public class equals {

	public static void main(String[] args) {
//		equals()==> method compares the two given string based on the content of the string. 
//					If any character is not matched, if returns false.
//					If all charactes are matched,it returns true.
		String s1="Welcome to Java";
		String s2="Welcome to Java";
		String s3="Welcome to C++";
		
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//CASE SENSİTİVE
		
		
		
		
		String s4=new String("Welcome to Java");
		System.out.println(s1==s4);// It is false. because == operator checks only whether two strings refer to the same object.
//										It does not tell you whether they have the same contents
		
		//if you use the equalsIgnoreCase(), it doesnt matter capital or lower letter between value.
		String k="KAaN";
		String t="kaan";
		System.out.println(k.equalsIgnoreCase(t));//It is true...
		
		
	}

}
