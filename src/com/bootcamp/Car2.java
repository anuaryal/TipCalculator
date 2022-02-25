package com.bootcamp;

//this project is to display all car features

public class Car2 {
	  String make = "";
	  String model = "";
	  int year = 1900;
	  String type = "";

	  public static void main(String[] args)  {
	    Car2 dinupCar = new Car2();
	    Car2 dayasCar = new Car2();
	    Car2 psCar = new Car2();

	    dinupCar.make = "Honda";
	    dinupCar.model = "Accord";
	    dinupCar.year = 2018;
		dinupCar.type = "Sedan";
	   

	    dayasCar.make = "Toyota";
	    dayasCar.model = "Prius";
	    dayasCar.year = 2013;
	    dayasCar.type = "Stationwagon";

	    psCar.make = "Dodge";
	    psCar.model = "Caravan";
	    psCar.year = 2006;
	    psCar.type = "Minivan";
	    

	   System.out.println("Following is the car information:\n");
	   System.out.println("Owner\tMake\tModel\tYear\tType\n") ;
	   System.out.println("Dinup" +"\t"+ dinupCar.make + "\t"+ dinupCar.model + "\t"+dinupCar.year + "\t"+dinupCar.type + "\n" )  ;  
	   System.out.println("Daya" +"\t"+ dayasCar.make + "\t"+ dayasCar.model + "\t"+dayasCar.year + "\t"+dayasCar.type + "\n"   )  ;  
	   System.out.println("Prakash" +"\t"+ psCar.make + "\t"+ psCar.model + "\t"+psCar.year + "\t"+psCar.type + "\n"  )  ;  
	    
	    
	  
		
	  
	    
	    
	  }
	}


	
