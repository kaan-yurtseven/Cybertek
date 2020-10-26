package liveSession17_10;

public class REcursion {

	public static void main(String[] args) {
//		Recursion : a method calling itself : BUT WHY??????
		printNumber(10);
		System.out.println("------------------------------");
		printNumberLowToHigh(1);
		
	}
	public static void printNumberLowToHigh(int num) {
		
		if(num>10) {
			System.out.println("THE END!!!");
			return;
		}
		
		System.out.print(num+" ");
		printNumberLowToHigh(num+1);
		
		
	} 
	public static void printNumber(int n) {
		
		if(n==0) {
			System.out.println("THE END!!!");
			return;
		}
		System.out.print(n+" ");
		
//		call printNumber with different number below
		//for exasmple one less that the value of n
		printNumber(n-1);//this is infinite value.
		
		
	}

	
	
}
