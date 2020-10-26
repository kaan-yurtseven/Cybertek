package Assigment_5;

public class Question_13 {

	public static void main(String[] args) {
		
//		Print following chessboard using nested for loops.
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//		NOTE:
//		1. Total 8 rows and 8 columns.
//		2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find consecutive W or B.
		
		int rows=8;
		for(int k=1;k<=rows;k++) {
			 if(k%2!=0) {
			for(int t=1;t<=rows;t++) 
			   if(t%2!=0) {
				 System.out.print("W ");
	
			    }else {
			    System.out.print("B ");
			}
		   
			}else {
				for(int t=1;t<=rows;t++) 
					   if(t%2!=0) {
						 System.out.print("B ");
			
					    }else {
					    System.out.print("W ");
			}
		
		}
		
			 System.out.println("");
	}
		
	}
}
