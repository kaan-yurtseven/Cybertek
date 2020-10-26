package day_16ClassObjects;

public class DogObjects {

	public static void main(String[] args) {
		
		
		Dog dog1=new Dog();
		
			dog1.breed="maltese";
			dog1.age=2;
			dog1.color="red";
			dog1.name="kuçu kuçu";
			System.out.println(dog1.age);
			System.out.println(dog1.color);
			System.out.println(dog1.breed);
			dog1.barking();
			dog1.sleeping();
			dog1.hungry();
		
		Dog dog2=new Dog();
			
			dog2.age=2;
			dog2.breed="kangal";
			dog2.color="white-gray";
			dog2.name="Sivaslı";
			System.out.println(dog2.age);
			System.out.println(dog2.color);
			System.out.println(dog2.breed);
			dog2.barking();
			dog2.hungry();
			dog2.sleeping();
		
		Dog dog3= new Dog();
		
			dog3.age=1;
			dog3.breed="Pitbull";
			dog3.color="Black";
			dog3.name="Aslan";
			System.out.println(dog3.age);
			System.out.println(dog3.color);
			System.out.println(dog3.breed);
			dog3.barking();
			dog3.hungry();
			dog3.sleeping();
		
//		String=null
//		int=0								java fill this automatically. you must to know.
//		boolean=false
		
		
		
	}

}
