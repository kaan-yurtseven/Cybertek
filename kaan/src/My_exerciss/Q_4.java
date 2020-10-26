package My_exerciss;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		
		for(int line=1;line<=k;line++) {
			for(int s=1;k-line>=s;s++) {
				System.out.print(" ");
			}
		     for(int num=1;(2*line)-1>=num;num++) {
		    	 System.out.print(num);
		     }
		System.out.println();
		}
	}

}
