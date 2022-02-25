package com.bootcamp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Car {
	  String make = "";
	  String model = "";
	  int year = 1900;
	  String type = "";

	  public static void main(String[] args) throws IOException {
	    Car dinupCar = new Car();
	    Car dayasCar = new Car();
	    Car psCar = new Car();

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
	    

	   String text1 = "Following is the car information:\n";
	   text1 = text1 + "Owner\tMake\tModel\tYear\tType\n" ;
	   text1 = text1 + ("Dinup" +"\t"+ dinupCar.make + "\t"+ dinupCar.model + "\t"+dinupCar.year + "\t"+dinupCar.type + "\n" )  ;  
	   text1 = text1 + ("Daya" +"\t"+ dayasCar.make + "\t"+ dayasCar.model + "\t"+dayasCar.year + "\t"+dayasCar.type + "\n"   )  ;  
	   text1 = text1 + ("Prakash" +"\t"+ psCar.make + "\t"+ psCar.model + "\t"+psCar.year + "\t"+psCar.type + "\n"  )  ;  
	    
	    
	  
		Path fileName = Path.of("C:\\bootcamp\\output.txt");
		Files.writeString(fileName,text1);
		  
		  
	  
	    
	    
	  }
	}


	
