package Assigment_6;

public class Question_1 {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
//		1 2 3 4 5 6
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
	
//lines=13
//colon=7
//after line 7, numbers are decreasing
	
	int line =1;
	int colon=7;
	while(true) {
	  if((line>=1)&(line<=7)) {
		for(int i=1;i<=line;i++) {
			System.out.print(i+" ");
		}System.out.println();
	    }else if((7<line)&(line<=13)) {
	    	for(int i=1;i<colon;i++) {
	    		System.out.print(i+" ");
	    		
	    	}System.out.println();
	    	colon--;
	    }else {
	    	break;
	    }
	  line++;
	  
	}
	

	}

}
