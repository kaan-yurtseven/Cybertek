package forLoop;

public class NestedForLoopLesson {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("Outer Loop Iteration "+i);
			for (int j=1;j<=2;j++) {
				System.out.println("i = "+i+" j = "+j);
			for (int k=1;k<=1;k++) {
				System.out.println("Let's do it Again");
			}
			}
		}
		System.out.println("İt is done");
		
		System.out.println("******************************");
		
		
	}

}
