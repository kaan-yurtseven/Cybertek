package Day_17ClassObject;

public class CarObject {

	public static void main(String[] args) {
		
		BMW b1=new BMW();
		BMW b2=new BMW();
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		b1.make="BMW2019";
		System.out.println(b1.make);  //this changed it just b1 value. b2 value is same.
		System.out.println(b2.make);
		b2.model="330i";
		System.out.println(b1.model);
		System.out.println(b2.model);
		b1.model="m3";
		b1.showPrice();
		b2.showPrice();
	}

}
