package Day_19StringClass;

public class StringWays {

	public static void main(String[] args) {
		String str = "Apple";//literal way
		String str2=new String("Apple");//new object (keyword) way
		
		System.out.println(str);			// what is the different?
//		Each time you create a literal way, JVM checks the "string pool" first. If the string already exist in the pool,
//			a reference to the pooled instance is returned. If the string does not exist in the pool, 
//			a new string instance is created and placed in the pool
		
		System.out.println(str2);			//
		
		
		
		
	}

}
