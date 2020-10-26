package day14_Methods_Part2;

public class Task_67 {
public static void main(String[] args) {
	lastdigit(7,17);
	boolean x=lastdigit(8,118);
	System.out.println(x);
}

		public static boolean lastdigit(int i, int j) {
			
			if(i%10==j%10) {
				boolean result=true;
				return result;
			}else {
				boolean result=false;
				return result;
			}
			
		}
}
