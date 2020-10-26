package day14_Methods_Part2;

public class MethodOverloading {

	public static void main(String[] args) {
		
//		This subject and method overriding soo important for interview
		
//		Method overloading =same name+different parameter(but same parameters)
//		This subject is soo easy for us. because it is more readable.
System.out.println(sum(2,3));
System.out.println(sum(2,3,4));
System.out.println(sum(2,3,4,5));
	System.out.println(sum(3, 8, 8, 9));
	}
		public static int sum(int a, int b) {
				return a+b;
		}
		public static int sum(int a,int b,int c) {
			return a+b+c;
		}
		public static int sum(int a,int b,int c,int d) {
			return a+b+c+d;
		}
//		RULES------SO IMPORTANT
//		
//		1-Number of parameter
//			add(int,int)
//			add(int,int,int)
//		2-Data Type of Parameter
//			add(int,int)
//			add(int,float)
//		3-Sequence of data type parameters
//			add(int,float)
//			add(float,int)
//		4-Invalid case-not overloading
//			int add(int,int)
//			float add(int,int)
		
	
}
