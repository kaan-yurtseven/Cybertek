package Day_13;

public class StudentMethod {

	public static void main(String[] args) {
		
//		This is method. void = this method does not return anything.
// Method name= "main"
sayHello();//if you write this code, you can run the other method.
//compiler run the method and come back here.
sayHello();		//as much as I want write this and compiler run how many time ı write.
	code();
	study();
	}
//if you want to create new method. you must write there.

    public static void sayHello() {
	//This is method. "main" can be everything name.
	System.out.println("Inside sayHello method");
	//if you want to wrtie this code, you must call code. 
}
    
    public static void code() {
    	System.out.println("Student is studying");
    }
    
   public static void study() {
	   System.out.println("Student is studying Java");
   }

}
