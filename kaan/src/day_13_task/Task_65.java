package day_13_task;

public class Task_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calculateGrade(30, 89, 95);
	}
	public static void calculateGrade(int num1,int num2,int num3) {
		double avarage=(num1+num2+num3)/3;
		System.out.println("Your avarage is "+avarage);
		if ((100>=avarage)&(avarage>=90)) {
			System.out.println("A");
		}else if ((89>=avarage)&(avarage>=80)) {
			System.out.println("B");
		}else if ((79>=avarage)&(avarage>=70)) {
			System.out.println("C");
		}else if ((69>=avarage)&(avarage>=60)) {
			System.out.println("D");
		}else if ((59>=avarage)&(avarage>=0)) {
			System.out.println("F");
		}
	}
}
