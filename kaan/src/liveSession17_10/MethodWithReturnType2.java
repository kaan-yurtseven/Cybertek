package liveSession17_10;

public class MethodWithReturnType2 {

	public static void main(String[] args) {
	int result=getTheSumOfNumberFrom1to100();
	System.out.println(result);
		System.out.println(getTheSumOfNumberFrom1to100());
	
		System.out.println("Sum from 1 to 100 = "+getTheSumOfNumberFromtoAnyNumber(100));
		System.out.println("Sum from 1 to 10  = "+getTheSumOfNumberFromtoAnyNumber(10));
		System.out.println("Sum from 1 to 55 =  "+getTheSumOfNumberFromtoAnyNumber(55));
		System.out.println("Sum from 1 to -1 = "+getTheSumOfNumberFromtoAnyNumber(-12));
	}	
		
		public static int getTheSumOfNumberFrom1to100() {
		int sum=0;
		for (int i=1;i<=100;i++) {
			sum=sum+i;//sum+=i;
			
		}return sum;
//	create a method that get the sum of numbers from 1 to 100
//	accept no parameter and return the sum
	
		
	}
//		create a method that get the sum of numbers from 1 to 100
//		accept no parameter and return the sum
		
		public static int getTheSumOfNumberFromtoAnyNumber(int num) {
			int sum=0;
			for(int i=1;i<=num;i++) {
				sum+=i;
				
			}return sum;
		}
		
		
		
		
		
}
