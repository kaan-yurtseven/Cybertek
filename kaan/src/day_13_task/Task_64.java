package day_13_task;

public class Task_64 {

	public static void main(String[] args) {
		stars(12);

	}
	public static void stars(int line) {
		for(int i=1;i<=line;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
