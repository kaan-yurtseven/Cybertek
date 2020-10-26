package day14_Methods_Part2;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		 int count =10;
		 int pre1=0;
		 int pre2=1;
		 System.out.println("Fibonacci series of "+count+" number");
		 for(int i=1;i<=count;i++) {
			 System.out.print(pre2+" ");
			
			 int sumOfPrevTwo=pre1+pre2;
			 pre1=pre2;
			 pre2=sumOfPrevTwo;
			 
			 
			
			
			 
			 
			 
			 
			 
		 }

	}

}
