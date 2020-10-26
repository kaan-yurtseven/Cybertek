package Assigment_6;



public class Question_2 {

	public static void main(String[] args) {
		
		
//		Write a Java program to print the following pattern
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
//		1 2 3 4 5 6
//		1 2 3 4 5 6 7
		
		int colons=7;
		int lines=1;//lines=13.before line7, numbers are decreasing. after line 7 numbers are increasing.
		while(lines<15) {
			int i=1;
			if(lines<=7) {
				for(i=1;i<=colons;i++) {
					System.out.print(i+" ");
				}System.out.println();
				colons--;
				lines++;
			}else if(colons==0) {
				colons++;
				lines++;
			}else if((lines>8)&(lines<=14)){
				colons++;
				for(i=1;i<=colons;i++) {
			        	System.out.print(i+" ");
				}System.out.println();
			        
			        lines++;
			}
			
		}
		
		
	}

}
