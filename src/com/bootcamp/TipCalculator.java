package com.bootcamp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class TipCalculator {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
				
		try {
		File inputfile = new File("C:\\bootcamp\\testfile.txt");
	    Scanner myfsc = new Scanner(inputfile) ;
		
			
    System.out.println("Enter your meal cost: ");
	double meal = myfsc.nextDouble();
	
    System.out.println("Enter tip percentage: ");
    int tip = myfsc.nextInt();
    
    System.out.println("Are you splitting the check? ");
    boolean splitCheck = myfsc.nextBoolean();
   
    
    System.out.println("How many people? ");
    int people = myfsc.nextInt();
    
    myfsc.nextLine();
    
    System.out.println("What is the server name? ");
    String serverName = myfsc.nextLine();
	 
    
    double tipAmount = meal * ((double)tip/((double)100));
    double mealTotal = meal + tipAmount;
    	
    System.out.println("You are tipping " + tip + "% for a tip total of $" + tipAmount);
    System.out.println("Your meal total is: $" + mealTotal);
    
    if (splitCheck == true && people > 1 ) {
    	double each = mealTotal/people;
    	System.out.println("Each person owes: $" + each);
    	
    }
    else if (people == 0) {
    	System.out.println("Are you sure there is nobody in your party?");
    }
    else {
    	System.out.println("Have a nice day.");	
    
    	
	}
    myfsc.close();
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}

