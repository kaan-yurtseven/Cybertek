package saturdayClase;

public class NumbersPattern2 {

	public static void main(String[] args) {
		
		for(int line=4;line>0;line--) {
			for(int s=1;(4-line)*2>=s;s++) {
				System.out.print(" ");
			}
		    for(int i=line;i>0;i--) {
		    	System.out.print(i+" ");
		    }
		System.out.println();
		}
		
		
		
		
	}

}
