package liveSession17_10;

public class UsingTheReturnKeywordToControlMethodExecution {

	public static void main(String[] args) {
			/*voter can vote if they are more than 18 else they can not
			 *create a void methods that accept age as argument
			 * to print You are eligible if age is more than 18
			 * not eligible if less that or equal to 18
			 */
printVotingEligibility(19);
printVotingEligibility(-1);
printVotingEligibility(200);
	}
//	return keyword has 2 usage:
	//	return a value from a non-void method
	//	exit feom the method when the line is reached	
//	we can not use break keyword to break out of method
	//break is onlt for switch and loop
	//return is only for method
	public static void printVotingEligibility(int age) {
//		if the age is less than 0 or more than 100
//		print INVALID NUMBER! and exit out of the message
		
	if(age<100&&age>0)	{
		if(age>18) {
			System.out.println("You are eligible to vote!!!");
		}else {
			System.out.println("You are not eligible to vote!!!");
		}
		
	}else {
		System.out.println("INVALID NUMBER!");
		return;//EXIT FROM METHOD
	}
	System.out.println("This is the end of the message!!");
}
}
