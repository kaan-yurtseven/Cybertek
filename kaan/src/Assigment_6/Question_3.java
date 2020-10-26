package Assigment_6;

public class Question_3 {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//		1 2 3 4 5 6 7
//		 2 3 4 5 6 7
//		  3 4 5 6 7
//		   4 5 6 7
//		    5 6 7
//		     6 7
//		      7
//		     6 7
//		    5 6 7
//		   4 5 6 7
//		  3 4 5 6 7
//		 2 3 4 5 6 7
//		1 2 3 4 5 6 7
		int i=1;
        int colons=8;
		int lines=1;//lines=13.
		int j=7;
		int k=6;
		if(lines<=7) {
			for(i=lines;lines<14;lines++) {
			    if(lines<8) {
			       for(i=1;i<lines;i++) {
				    System.out.print(" ");}
				
			       for(i=lines;i<colons;i++) {
					System.out.print(i+" ");
				   }
			       System.out.println();
			    }
			
			if((lines>=8)&(lines<=13)) {
				for(i=2;i<=k;i++) {
						System.out.print(" ");}
						
				for(i=k;i<=j;i++) {
							System.out.print(i+" ");
						}
				
				k--;
				System.out.println();
			}
				
			}
		}
		
		}
	}


		
	


