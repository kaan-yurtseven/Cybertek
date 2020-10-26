package Assigment_5;

public class Question_6 {

	public static void main(String[] args) {
		//Write a program to print Fibonacci series of n terms where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
int n1=0,n2=1,n3,i;
System.out.print(n1+","+n2);
	for(i=2;;i++) {
		n3=n1+n2;
		System.out.print(","+n3);
	n1=n2;
	n2=n3;
	}
	
	}

}
