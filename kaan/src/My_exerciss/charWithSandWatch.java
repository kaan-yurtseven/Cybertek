package My_exerciss;

public class charWithSandWatch {

	public static void main(String[] args) {
		char end='g';
		for(int line=1;line<=7;line++) {
			if(line<=4) {
				for(int s=1;s<=(line-1);s++) {
					System.out.print(" ");
				}
				for(char letter='a';letter<=end;letter++) {
					System.out.print(letter);
				
				}System.out.println();
				end-=2;
			}else if((line>4)&(line<=7)) {
				for(int s=1;s<=7-line;s++) {
					System.out.print(" ");
				}end+=4;
				
				if(end<='g') {
				for(char letter='a';letter<=end;letter++) {
					System.out.print(letter);
				}System.out.println();
				end-=2;
			}else {
				break;
			}
		}
		
	}
	}
}
;