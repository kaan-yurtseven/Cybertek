
public class NestedFor {

	public static void main(String[] args) {
//		int x=0;
//		for(long y=0,z=4;x<5&&y<10;x++,y++) {
//			System.out.print(y+" ");
//		}
//System.out.println(x);
//System.out.println(y); ıt does not compile because "y" is not global. it is compile into pharanthesis.
		
	
	//3- Redeclaring a variable in the init block
//int x=0;
//for (long y=0,x=4;x<5&&y<10;x++,y++) {// does not compile. because x is globaly value. 
//	
//}

//		int x=0;
//		long y=0;
//		for(y=1,x=3;x<5&&y<10; x++,y++) { THİS İS COMPİL
//			System.out.println("Hello");
//		}
	
	
	//4-Using incompatible datat types in the init block
		//The variable in the init block must all be of the same daatype
		
//	for(long y=0, int x=0;x<5&&y<10;x++,y++) {(Doesnt compile)
//		
//	}
	
	//5-using loop variable outside the loop
//		for(long y=1,x=3;x<5&&y<10; x++,y++) {
//			System.out.println("Hello");
//		}
	//System.out.println(x);//doesnt compile. because the variable is not globally
	
//		int i=1;
//		for(;i<5;i++) {
//			System.out.println(i);
//		}
//		
	
		
	 }

}
