package Day_19StringClass;

public class StringClassMethos_charAt {

	public static void main(String[] args) {
		
//		charAt() method: returns a char value at the given index number.
//			String indexes are zero-based: The first charavter is in position 0, the second in 1, and so on
		String name="Kaan YURTSEVEN";
		System.out.println(name.length());
		System.out.print(name.charAt(0));
		System.out.print(name.charAt(1));
		System.out.print(name.charAt(2));
		System.out.print(name.charAt(3));
		System.out.print(name.charAt(4));
		System.out.print(name.charAt(5));
		System.out.print(name.charAt(6));
		System.out.print(name.charAt(7));
		System.out.print(name.charAt(8));
		System.out.print(name.charAt(9));
		System.out.print(name.charAt(10));
		System.out.print(name.charAt(11));
		System.out.print(name.charAt(12));
		System.out.print(name.charAt(13));
//		System.out.println(name.charAt(17));//It is error
		
		
		String name2 = "Apple";
		System.out.println(name2.length());
		if(name2.charAt(0)=='A') {
			System.out.println("A is the first character");
		}else {
			System.out.println("A is not the firs character");
			
			
		}
		String name3="civic";
		//check if first and last characters are same
		if(name3.charAt(0)==name3.charAt(4)) {
			System.out.println("first and last characters are same");
		}else {
			System.out.println("first and last characters are not same");
		}
		
		
		
		
		String word="Java";
		char lastChar=word.charAt(word.length()-1);
		System.out.println("last char of "+ word+" is "+ lastChar );
		
		
		
	}

}
