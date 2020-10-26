package Day22_String_ManupilationLab;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		String word1="Eclipse";
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("E"));
		System.out.println(word1.startsWith("Ecl"));
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("pse"));
		
//		Mr. =>married man
//		Mrs. => married woman
//		Ms. =>some woman
//		Dr. =>doctor man or woman
//		No title =>unknown status.
		
		String name="Dr. Kaan";
		
		if(name.startsWith("Mr.")) {
			System.out.println("married man");
		}else if(name.startsWith("Mrs.")){
			System.out.println("married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("some woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("doctor man or woman");
		}else {
			System.out.println("unknown status.");
		}
		
		
		
		
		
		
	}

}
