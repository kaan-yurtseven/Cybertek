package day14_Methods_Part2;

public class Task_68 {

	public static void main(String[] args) {
		
	yearsUntilretirement("kaan",1993);
	}

		public static int calculatedAge(int birthYear) {
			
			return 2020-birthYear;
		
		}
		public static void yearsUntilretirement(String name, int year) {
			
			int retirementAge=65-calculatedAge(year);
			System.out.println(name+" retires in "+retirementAge+" years");
			
		}
}
