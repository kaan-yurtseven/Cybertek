package liveSession17_10;

public class MethodWithReturnType {

	public static void main(String[] args) {
	
		String message=getMyMotto();
		System.out.println("My favorite motto is "+message);
		fahrenheitToCelcius(45);
		System.out.println("54.9 F in TR is "+fahrenheitToCelcius(54.9));
	}

	public static double fahrenheitToCelcius(double f) {
	double c=(f-32)*1.8;
	return c;
//	System.out.println(" "); It does not compile because return is break.
//	return keyword has 2 usage:
//	return a value out of a method that return a value
//	exit the method early(ANY METHODS including )
	}
	
	public static String getMyMotto() {
		String motto="Tuğçe'yi seviyorum";
		return motto;
	}

}
