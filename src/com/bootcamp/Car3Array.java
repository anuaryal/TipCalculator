package com.bootcamp;
//this program is to create an array list//
import java.util.ArrayList;

public class Car3Array {
	  String make = "";
	  String model = "";
	  int year = 1900;
	  String type = "";

	  public static void main(String[] args)  { 
		  
		Car3Array dinupCar = new Car3Array();
	    Car3Array dayasCar = new Car3Array();
	    Car3Array psCar = new Car3Array();

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
	    

	  // System.out.println("Following is the car information:\n");
	  // System.out.println("Owner\tMake\tModel\tYear\tType\n") ;
	 //  System.out.println("Dinup" +"\t"+ dinupCar.make + "\t"+ dinupCar.model + "\t"+dinupCar.year + "\t"+dinupCar.type + "\n" )  ;  
	 //  System.out.println("Daya" +"\t"+ dayasCar.make + "\t"+ dayasCar.model + "\t"+dayasCar.year + "\t"+dayasCar.type + "\n"   )  ;  
	 //  System.out.println("Prakash" +"\t"+ psCar.make + "\t"+ psCar.model + "\t"+psCar.year + "\t"+psCar.type + "\n"  )  ;  
	    
	    ArrayList<Car3Array> autos = new ArrayList<Car3Array>(); 
		  
		autos.add(dinupCar);
		autos.add(dayasCar);
		autos.add(psCar);
	
		for (int i=0; i<autos.size(); i++) {
			 System.out.println(autos.get(i).make);
			 System.out.println(autos.get(i).model);
			 System.out.println(autos.get(i).year);
			 System.out.println(autos.get(i).type);
		}
	 
	    
	    
	  }
	}


	
