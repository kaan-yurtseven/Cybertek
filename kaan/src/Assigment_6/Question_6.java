package Assigment_6;

public class Question_6 {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//		1
//		2 6
//		3 7 10
//		4 8 11 13
//		5 9 12 14 15
	
	
	
		for(int i=1;i<=10;i++) {
			
			for(int j=1;j<=i;j++) {
				int t=i;
				for (int n=9;n>10-j;n--) {
					t=t+n;
				}
				System.out.print(t+" ");}
				System.out.println("");	}
	
	
	

	}
}