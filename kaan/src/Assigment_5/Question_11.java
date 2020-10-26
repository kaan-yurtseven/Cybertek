package Assigment_5;

public class Question_11 {

	public static void main(String[] args) {
//		Print the following output using nested for loops.
//		4       3       2      1
//		     3       2      1
//		         2       1
//		              1
//	

		
	for(int k=4;k>0;k--) {
		for(int m=k;m>0;m--) {
			System.out.print(m+"           ");
		
		}
		System.out.println();
		for(int n=4;n>=k;n--) {
			System.out.print("     ");
		}
	}
	
	
	
	
	}

}

