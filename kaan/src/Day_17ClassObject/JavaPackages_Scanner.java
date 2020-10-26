package Day_17ClassObject;

import java.util.Scanner;

public class JavaPackages_Scanner {

	public static void main(String[] args) {
		/* when you want to use different package in class, There is syntax
		 * 
		 * import package.name.class;(import a single class)
		 * import package.name.*;(import the whole package
		 * 
		 * If you want to import another package you must to use util package. 
		 * "System(in sout)" does not need to import. because java automatically fill the lang package
		 *
		 *	For example:
		 *
		 *		import java.util.Scanner; (java.util=package name, Scanner=Class)
		 *		import java.util.*;
		 *
		 *Char does not compile for Scanner
		 *
		 *
		 *
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please, enter your input!");
		String x=scan.nextLine();
		System.out.println("input = "+x );

	}

}
