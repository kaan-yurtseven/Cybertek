package kaan;
import java.util.*;

public class kaan1 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		    
//		    System.out.println("Welcome to Cybertek Apartments!");
//		    System.out.println("Number of bedrooms you are interested:");
//		    int numberOfBedrooms = scan.nextInt();
//		    int startingPrice=0;
//		    //WRITE YOUR CODE HERE
//		    switch(numberOfBedrooms){
//		      case 1:
//		        System.out.println("One bedroom Selected");
//		        startingPrice=1100;
//		        System.out.println("Starting Price: " +startingPrice);
//		        break;
//		         case 2:
//		        System.out.println("Two bedroom Selected");
//		        startingPrice=1850;
//		        System.out.println("Starting Price: " +startingPrice);
//		        break;
//		         case 3:
//		        System.out.println("Three bedroom Selected");
//		        startingPrice=2550;
//		        System.out.println("Starting Price: " +startingPrice);
//		        break;
//		        default:
//		        System.out.println("No such Bedrooms available");
//		    }
//		    
//		    
		  
//		  int num1,num2,num3;
//		  System.out.println("Enter first number:");
//		  num1=scan.nextInt();
//		  System.out.println("Enter second number:");
//		  num2=scan.nextInt();
//		  System.out.println("Enter third number:");
//		  num3=scan.nextInt();
//		  if((num1<num2)&(num2<num3)){
//			System.out.println("Medium value is: "+num2);
//		  }else if((num1<num3)&(num3<num2)){
//			System.out.println("Medium value is: "+num3);
//		  }else {
//			System.out.println("Medium value is: "+num1);
//		}
//		}
//
//		
//		  }
//		
//		   System.out.println("what is the farthest planet in the solar system:" );
//		    System.out.println("a)venus" );
//		    System.out.println("b)pluto" );
//		    System.out.println("c)neptune" );
		    
//		    String a = s.nextLine();
		    
		    //your code here
//		System.out.println(a);
//		switch(a){
//		  case "a":
//		    System.out.println(a+" is wrong");
//		    break;
//		    case "b":
//		    System.out.println(a+" is correct");
//		    break;
//		    case "c":
//		    System.out.println(a+" is wrong");
//		    break;
//		    default:
//		    System.out.println(a+" is not a valid answer");
//		}
//		  
//
//		    
//		  }
//		}
		    
//		
//		 System.out.println("Enter vehicle's year:");
//		   int vehicleYear=scan.nextInt();
//		   if((1995<=vehicleYear)|(vehicleYear<=1998)|(2001<=vehicleYear)|(vehicleYear<=2002)|(2004<=vehicleYear)|(vehicleYear<=2006)|(2015<=vehicleYear)|(vehicleYear<=2017)){
//		     System.out.println("Your vehicle needs to be recalled!");
//		   }else{
//		    System.out.println("Your vehicle is fine, enjoy!");
//		     
//		   }
//		  }
//		}
//		 Scanner inp = new Scanner(System.in);
//		  	System.out.print("In:");
//		  	int num = inp.nextInt();
//		  	//DO NOT CHANGE ABOVE CODE!  Write your code below
//		  System.out.println(num);
//		  	if(num%2==0){
//		  	  System.out.println(num+" is even");
//		  	}else{
//		  	  System.out.println(num+" is odd");
//		  	}
//		  }
//		}
//		
		 int propertyPrice = 0; 
			int numberOfBedrooms, garageSpots;
			float metroAccessibility, schoolScore, highwayAccessibility;
			boolean backyard, smoking, garage;
			String houseType;
			//Scanner scan = new Scanner(System.in);
			System.out.println("*****************************************");
			System.out.println("* Welcome to the RealEstate calculator! *");
			System.out.println("*****************************************");
	    //WRITE YOUR CODE HERE
	    System.out.println("Enter your property type:");
	    houseType=scan.nextLine();
	    switch(houseType){
	      case "Condo":
	        propertyPrice=50000;
	        break;
	    case "Townhouse":
	      propertyPrice=75000;
	      break;
	      case "Single Family Home":
	        propertyPrice=95000;
	        break;
	     }
	     System.out.println("How many bedrooms do you have?");
	    numberOfBedrooms=scan.nextInt();
	     propertyPrice=propertyPrice+(numberOfBedrooms*30000);
	     System.out.println("Do you have a backyard?" );
	     backyard=scan.nextBoolean();
	     if (backyard){
	       if(houseType.equals("Condo")){
	         System.out.println("Backyard is not available for a condo!");
	        
	       }else{
	         propertyPrice+=5000;
	         }
	      }
	     
	     System.out.println("Do you have garage?" );
	     garage=scan.nextBoolean();
	     System.out.println("How many spots?");
	     garageSpots=scan.nextInt();
	     
	     if(garageSpots>10){
	       System.out.println("Pardon,  it's not a public parking!");
	       }else{
	         propertyPrice+=(garageSpots*20000);
	       }
	     
	     System.out.println("How close is metro station?");
	     metroAccessibility=scan.nextFloat();
	     if (metroAccessibility<=1){
	       propertyPrice+=10000;
	     }else if((metroAccessibility>1)&(metroAccessibility<=3)){
	       propertyPrice+=5000;
	     }
	    System.out.println("How close is highway?");
	    highwayAccessibility=scan.nextFloat();
	    if (highwayAccessibility<=1) {
	    	propertyPrice+=15000;
	    }else if ((highwayAccessibility<=5)&(highwayAccessibility>1)) {
	    	propertyPrice+=8000;
	    	
	    }else if ((highwayAccessibility>5)&(highwayAccessibility<=20)) {
	    	propertyPrice+=4000;
	    }
	     System.out.println("What's the rating of nearest school?");
	     schoolScore=scan.nextFloat();
	     if((schoolScore<=10)&(schoolScore>=8)){
	       propertyPrice+=45000;
	     }else if((schoolScore<8)&(schoolScore>=4)){
	       propertyPrice+=20000;
	     }else{
	       propertyPrice+=5000;
	     }
	     System.out.println("Does any of your family members smoking?");
	     smoking=scan.nextBoolean();
	     if(smoking){
	       propertyPrice+=5000;
	     }
	     System.out.println("Market report has been generated."); 
	     
	     System.out.println("Your estimate market price is: "+propertyPrice);
	     
	     
	     
	  }
	}

