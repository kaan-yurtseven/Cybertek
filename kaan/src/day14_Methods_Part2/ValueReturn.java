package day14_Methods_Part2;

public class ValueReturn {

	public static void main(String[] args) {
		
		sum(2,3);
		int v1 =sum(2,3);
		System.out.println(v1);
		sum1(3,4);
		System.out.println(sum1(3,4));
		//the int variable returned that.
		
	}
		public static int sum(int num1,int num2) {
			//if we write void, it s not returning anything.ıf you want to return something,you must change void
			
			
			int result;//local variable
			result=num1+num2;//5
			return result;	
		}
		public static double sum1(int num1,int num2) {
			double result=num1+num2;
			return result;
		}


}


