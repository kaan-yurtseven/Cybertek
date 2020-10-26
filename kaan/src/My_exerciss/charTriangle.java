package My_exerciss;

import java.util.Scanner;

public class charTriangle {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int end=scan.nextInt();
		
		for(int line='a';line<='z';line++) {
			for(char start='a';start<=line;start++) {
				System.out.print(start+" ");
			}System.out.println();
		}
		
		
		
		
		
		
	}

}
