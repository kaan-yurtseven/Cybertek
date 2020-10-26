package day14_Methods_Part2;

public class Task_66 {

	public static void main(String[] args) {
		
		
		double distanceTraveled=distance(40,5);
		System.out.println(distanceTraveled);
		
		if(distanceTraveled>500) {
			System.out.println("You spend too much gas");
		}else {
			System.out.println("You spend ok gas");
		}
		
	}

	public static double distance(double speed,double time) {
		double distanceTraveled=speed*time;
		return distanceTraveled;//this is breaking method
//		System.out.println("Hello"); it does not run this code.
		
		
		
		
	}

}
