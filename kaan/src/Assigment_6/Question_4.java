package Assigment_6;

public class Question_4 {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//		1
//		10
//		101
//		1010
//		10101
//		101010
//		1010101

		int rows=7;
		
		for(int i=1;i<=rows;i++) {
			for(int k=1;k<=i;k++) {
				if(k%2==0) {

					System.out.print(0);
				}else {
					System.out.print(1);
				}
			}
	System.out.println();
		}
		
		
		
		
		
		
		
		}

	

}
	


