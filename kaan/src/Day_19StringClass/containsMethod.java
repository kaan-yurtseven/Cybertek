package Day_19StringClass;

public class containsMethod {
	public static void main(String[] args) {
		
		
//		contains() method: searches the sequence of characters in this string.
//			It returns true if sequence of char values are found in this string otherwise returns false
		
		String str="Hello Kaan, welcome to Cybertek World.";
		boolean bool=str.contains("Cybertek");
		System.out.println(bool);
		System.out.println(str.contains("Kaan"));//Case sensitive SOOOO İMPORTANT!!
		
		
		
		String email = "kaanyurtseven.md@gmail.com";
		System.out.println(email.contains("@"));
		String list="potatoes,tomatoes,eggs,milk,cereal,bread,meat,apples";
		if(list.contains("apples")) {
			System.out.println("Apples are in your list");
		}else {
			System.out.println("Apples are not in your list");
		}
	}

}
