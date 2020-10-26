package My_exerciss;

public class Stars {

	public static void main(String[] args) {
		for(int line=1;line<10;line++) {
			if(line<=5) {
				for(int s=1;5-line>=s;s++) {
					System.out.print(" ");
				}
			    for(int num=1;2*line-1>=num;num++) {
			    	System.out.print("*");
			    }
			System.out.println();
			}else {
				for(int s=1;line-5>=s;s++) {
					System.out.print(" ");
				}
				for(int num=1;(19-2*line)>=num;num++)	{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	}

}
