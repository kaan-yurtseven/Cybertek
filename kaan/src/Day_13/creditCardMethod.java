package Day_13;

public class creditCardMethod {

	public static void main(String[] args) {
		
		double salary=5000;
		int creditRating=5;
		
		if (salary>=20000&&creditRating>=7) {
			qualify();
		}else {
			noQualify();
		}
	}

	public static void qualify() {
		System.out.println("Congrat, you are qualified for the CC");
	}

	public static void noQualify() {
		System.out.println("I am sorry, you are not qualified for the CC");
	}

}
