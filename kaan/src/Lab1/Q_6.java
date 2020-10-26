package Lab1;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Cigar:");
		int cigar=scan.nextInt();
		System.out.println("is it the weekend?");
		String weekend=scan.next();
		cigarParty(cigar,weekend);
		
		
	}

	public static void cigarParty(int x,String y) {
		if(y.equalsIgnoreCase("yes")) {
			if(40<=x) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}else if((40<=x)&(x<=60)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
