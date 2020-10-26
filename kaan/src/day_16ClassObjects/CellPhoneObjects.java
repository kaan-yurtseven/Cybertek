package day_16ClassObjects;

import java.util.Scanner;

public class CellPhoneObjects {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);// ı do this. ı wonder if ı write with scanner does compile run?
		CellPhone cell1=new CellPhone();
		cell1.brand=scan.next();
		System.out.println(cell1.brand);
		cell1.color="Space Gray";
		System.out.println(cell1.color);
		cell1.price=8000;
		System.out.println(cell1.price+" tl");
		cell1.screenSize=5;
		System.out.println(cell1.screenSize+" inch");
		cell1.call();
		cell1.message();
		cell1.takeAphoto();
		
	}

}
