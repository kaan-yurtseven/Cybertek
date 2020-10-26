package saturdayClase;

public class multiplicationTable {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("Multiplication for "+ i);
			for(int k=1;k<=10;k++) {
				System.out.println(i+"*"+k+"="+(k*i));
			}System.out.println("**************");
		}
	}

}
