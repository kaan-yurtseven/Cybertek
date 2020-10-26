package day_16ClassObjects;

public class CarObjects {

	public static void main(String[] args) {
		
		
		Car car1=new Car();
		
			car1.printCarInfo();
			car1.make="Ford";
			car1.color="Grey";
			car1.model="Fiesta";
			car1.currentSpeed=55;
			car1.printCarInfo();
			car1.showCurrentSpeed(37);
			car1.showCurrentSpeed(70);
			car1.drive();
			car1.accelerate(23);//currentspeed+accelerate
			System.out.println(car1.currentSpeed);
		
		
		
		
		
		
		
		
	}

}
