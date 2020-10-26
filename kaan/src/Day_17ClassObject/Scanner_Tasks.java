package Day_17ClassObject;

import java.util.Scanner;//"import java.util.*" is same.

public class Scanner_Tasks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a byte value:");
		byte b1=sc.nextByte();//you can write this int b1=sc.nextByte. But value must to be byte.
		System.out.println(b1);
		System.out.println(b1*4);
		System.out.println(b1%3);
//		sc.close();//if you write this sc ended.
//		byte b2 =sc.nextByte(); IT DOES NOT COMPİLE!!!
		System.out.println("Enter another byte value");
		byte b2=sc.nextByte();
		System.out.println(b2);
		System.out.println(b2*4);
		System.out.println(b2%3);
		
		
	}

}


