package saturdayClase;
import java.util.*;
public class repl {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Split:");
		String split=scan.next();
		
		System.out.println("Number of people:");
		int numberOfPeople=scan.nextInt();
		
		System.out.println("Check amount:");
		double amount=scan.nextDouble();
		
		System.out.println("Service Quality:");
		String serviceQuality=scan.next();
		
		double totalTip=0;
		double totalPay=0;
		double totalPerPerson=0;
		double tipPerPerson=0;
		
		// WRITE YOUR CODE HERE
		double tipPercent=0;
		if(serviceQuality.equals("Poor")){
		  tipPercent = 0.05;
		}else if(serviceQuality.equals("Fair")){
		  tipPercent = 0.1;
		}else if(serviceQuality.equals("Good")){
		  tipPercent = 0.15;
		}else if(serviceQuality.equals("Great")){
		  tipPercent = 0.20;
		}else if(serviceQuality.equals("Excellent")){
		  tipPercent = 0.25;
		}
		
		totalTip=amount*tipPercent;
		totalPay=totalTip+amount;
		totalPerPerson=totalPay/numberOfPeople;
		tipPerPerson=totalTip/numberOfPeople;
		System.out.print("Number of people entered: ");
	    for(;numberOfPeople>0;numberOfPeople--) {
		System.out.print("&");
	}
		System.out.println("Total to pay: "+totalPay);
		System.out.println("Total tip: "+totalTip);
		System.out.println("Total per person: "+totalPerPerson);
		System.out.println("Tip per person: "+totalPerPerson);
  
	}

}
