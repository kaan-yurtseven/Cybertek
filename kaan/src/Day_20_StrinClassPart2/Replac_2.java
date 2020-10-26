package Day_20_StrinClassPart2;

public class Replac_2 {

	public static void main(String[] args) {			
		String sentence="Coding is fun, it is my hobby!";
		String withNoSpace=sentence.replace(" " , "");
			System.out.println(withNoSpace);
			System.out.println(sentence);
		String withNoComma=sentence.replace(",", "!!!");
			System.out.println(withNoComma);
		
			
			
		String k=timeStamp("10/10/2019 14:59:00");
		System.out.println(k);
				
	}
		public static String timeStamp(String date) {
			date=date.replace("/", "").replace(" ", "").replace(":", "");
			return date;
		}
}
