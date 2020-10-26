package Day_20_StrinClassPart2;

public class indexOfMethod {

	public static void main(String[] args) {
		//indeOf(); method returns the index within the calling String of the first occurence of the specified value, starting fromIndex.
//					Returns -1 if the value is not found.
		
		String str="Hello Kaan, welcome to Cybertek World.";
		System.out.println(str.indexOf("a"));
		
		String word1="github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		
		System.out.println(word1.indexOf("java"));
		
		
		
		String word2="java,c++,python,tomcat,eclipse";
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
			
		}
		
		if(word2.indexOf("c++")>-1) {  //if you want to convert the indexof() to boolean value, you will put there ">-1"
			System.out.println("c++ is there");
			
		}else {
			System.out.println("c++ is not there");
			
		}
		
			
	}

}
