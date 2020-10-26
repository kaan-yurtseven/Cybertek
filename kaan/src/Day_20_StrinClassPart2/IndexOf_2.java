package Day_20_StrinClassPart2;

public class IndexOf_2 {

	public static void main(String[] args) {
		
		// if the string has the two dut, how ı am gonna get it the second dut?
		
		String list="html-selenium-angular-jenkins-grid";
		int firstDash=list.indexOf("-");
		System.out.println(firstDash);
		int secondDash=list.indexOf("-", 5);//compiler is gonna look for dash after 5.İf you write 4 the result is gonna change.
		System.out.println(secondDash);
		int thirdDash=list.indexOf("-",	secondDash+1);
		System.out.println(thirdDash);
		int lastDash=list.lastIndexOf("-");//SOO İMPORTANT
		System.out.println(lastDash);
		int x =list.lastIndexOf("-", 22);//compiler checks the backward
		System.out.println(x);
		System.out.println(list.charAt(x));
		
	}

}
