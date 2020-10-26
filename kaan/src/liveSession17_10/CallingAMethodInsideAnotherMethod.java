package liveSession17_10;

public class CallingAMethodInsideAnotherMethod {

	public static void main(String[] args) {
		/*
		 * wakeUp()
		 * 
		 * prepareTheKids()
		 * 		makeBreakfast()
		 * 		feedTheKids()
		 * 		dropTheKidsToSchool()
		 * 
		 * workAndLearn()
		 * 		work()
		 * 		attendClass()
		 * 
		 */
		wakeUp();
		System.out.println("----------------------------------------");
		prepareTheKids();
		System.out.println("----------------------------------------");
		workAndLearn();
		System.out.println("----------------------------------------");
		
	}

		public static void wakeUp() {
			System.out.println("Open one eye");
			System.out.println("Close it and back to sleep");
			System.out.println("Throw the alarm, wake up and drink coffee");
		}
			public static void prepareTheKids() {
				System.out.println("Prepare the kids method start");
				makeBreakfast();
				feedTheKids();
				dropTheKidsToSchool();
				System.out.println("Prepare the kids method end");
				
			}
		
		public static void makeBreakfast() {
			System.out.println("Make a turkish tea or coffe");
			System.out.println("Cereal,egg,milk,toast");
		}
		public static void feedTheKids() {
			System.out.println("Feed the kids with love, and nice food");
		}
		public static void dropTheKidsToSchool() {
			System.out.println("Pop up in the car,drive to school,dropoff");
		}
		public static void workAndLearn() {
			work();
			attendClass();
		}
		public static void work() {
			System.out.println("working as an SDET");
		}
		public static void attendClass() {
			System.out.println("Attending class at Cybertek");
		}
		
		
}
