package My_exerciss;

public class Q_2 {

	public static void main(String[] args) {
		for(int line=0;line<=4;line++) {
			for(int space=1;(-1*line)+4>=space;space++) {
				System.out.print(" ");
			}
             for(int num=1;(2*line)+1>=num;num++) {
            	System.out.print(line+1);
		}System.out.println();
		}
	}

}


