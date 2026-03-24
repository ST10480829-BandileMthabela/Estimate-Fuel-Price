// ST10480829 Bandile Mthabela
// ICE Task 1
package com.mycompany.estimate_fuel_price;

import java.util.Scanner;

public class Estimate_Fuel_Price {

    public static void main(String[] args) 
    {
    Scanner keep = new Scanner(System.in);

    System.out.print("Please enter the the distance.");
        double distance = keep.nextDouble();
        
    System.out.print("Fuel efficiency (Km/l)");
        double fuelEfficiancy = keep.nextDouble();
        
    System.out.print("Price of fuel per leter.");
        double pricePerFuel = keep.nextDouble();

    System.out.println("=================== Estimate Fuel Price ===================");
    System.out.println("Total Cost: R " + distance );
    System.out.println("Fuel Efficiency: R" + fuelEfficiancy);
    System.out.println("Price of price: R" + pricePerFuel);
    System.out.println("===========================================================");  
    }
   
}
