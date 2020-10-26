package day14_Methods_Part2;

public class Task_71_calcFeetAndInchesToCentimeters {

	public static void main(String[] args) {
		
		
		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(6,5);
	}

	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		
		if(feet<0 || inches<0 || inches>12) {
			System.out.println("Invalid feet or inches");
			return -1;
			
		}
			double cm=(feet*12)*2.54 ;
			System.out.println(feet+" feet,"+inches+" inches = "+cm+" centimeters");
			return cm;
		}
		
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches<0) {
			return -1;
		}
		double feet = ((int)inches/12);//if you write the int result is integer. but you dont write int result is double.
		double remainingInches=inches%12;
		System.out.println(inches+" inches = "+feet+" feet and "+remainingInches+" inches");
			return calcFeetAndInchesToCentimeters(feet, remainingInches);
		}
	}

