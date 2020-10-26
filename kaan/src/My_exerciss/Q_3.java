package My_exerciss;

public class Q_3 {

	public static void main(String[] args) {
		for(int line=1;line<=5;line++) {
			if(line<3) {
				for(int s=0;(line-1)>s;s++) {
				System.out.print(" ");
			    }
		        for(int num=line;num<=line;num++) {
		        	System.out.print(line);
		        }
		        for(int bspace=0;(-2*line)+5>bspace;bspace++) {
		        	System.out.print(" ");
		        }
		        for(int num=line;num<=line;num++) {
		        	System.out.print(line);
		        }
		        
			}else if(line==3){
				System.out.print("  3");
			}else if (line>=4){
				for(int s=1;(5-line)>=s;s++) {
					System.out.print(" ");
				}
				for(int num=line;num<=line;num++) {
		        	System.out.print(line);
				}
				
				for(int bspace=0;(2*line)-7>bspace;bspace++) {
		        	System.out.print(" ");
		        }
				for(int num=line;num<=line;num++) {
		        	System.out.print(line);
				}
			}System.out.println();
	    }
	}
}
