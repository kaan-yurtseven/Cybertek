package saturdayClase;

public class Char_Exercises {

	public static void main(String[] args) {
		
		char endingLetter='E';
		   for(int line=1;line<=5;line++) {
			  
			  if(line<=3) {   
			   for(int s=1;line-1>=s;s++) {
				   System.out.print(" ");
			   }
		       for(char letter='A';letter<=endingLetter;letter++) {
		    	   System.out.print(letter);
		    	   
		       }System.out.println();
		       endingLetter-=2;
		   
			  }else {
				  for(int s=1;5-line>=s;s++) {
					  System.out.print(" ");
				  endingLetter='A';
				  }
				  endingLetter+=2;
			      for(char letter='A';letter<=endingLetter;letter++) {
			    	  System.out.print(letter
			    			  );
			      }
			      System.out.println();
			  }
		   
		   
		   
		   
		   
		   }
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
