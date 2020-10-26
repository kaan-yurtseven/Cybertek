package saturdayClase;

public class NumbersPatternWithSpace {

	public static void main(String[] args) {
		for(int line=4;line>0;line--) {
			for(int s=0;4-line>s;s++) {
				System.out.print(" ");
			}
			for(int num=line;num>0;num--) {
				System.out.print(num+" ");
			}System.out.println();
		}
	}

}
