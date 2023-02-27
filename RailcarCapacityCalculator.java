 /**
 * Name: Mohammed Lateef, 1086818
 * Date: 19 October, 2022
 * Question: Railcar Capacity Calculator
 */

//Import Libraries
import java.util.Scanner;
import java.lang.Math;

public class RailcarCapacityCalculator {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        //Declare variables
        String company_name = "";
        int no_of_cars_to_ship = 0;
        int no_of_railcars = 0;
        int no_of_railcars_needed = 0;
        int no_of_cars_per_rail = 0;
        int no_of_automobiles_can_ship = 0;
        int no_of_automobiles_can_not_ship = 0;
        int additional_automobiles = 0;
        double percent_no_of_Automobiles_can_ship,percent_no_of_Automobiles_cannot_ship = 0.0;
        
    // Display Title 
    System.out.println("Welcome to Mohammed Lateef's ");
    System.out.println("Train Master Railcar Capacity Analysis");
    System.out.println("----------------------------------------------------------");
    System.out.println("Enter Your Company's name, Number of automobiles to be shipped by your company,");
    System.out.println("Maximum number of automobiles per railcar,Number of railcars available");
    System.out.println("This tool will produce a report whether or not automobiles");
    System.out.println("can be shipped by the train car you have available, and if not,");
    System.out.println("how many number and percentage of automobiles will be shipped and,");
    System.out.println("how many number and percentage of automobile will be left behind");
    System.out.println("----------------------------------------------------------");
        
     
    //Get input from the user    
    System.out.print(" Name of the railway company:"); 
    company_name = input.nextLine();

    System.out.print(" Number of automobiles to be shipped by"+ " "+ company_name +":"); 
    no_of_cars_to_ship = input.nextInt();

    while(no_of_cars_to_ship < 36) //Validate input from user
    {
        System.out.print("Error: Number of automobiles must be atleast 36. Try again:");
        no_of_cars_to_ship = input.nextInt();
    } 
    System.out.print(" Maximum number of automobiles per railcar:"); 
    no_of_cars_per_rail = input.nextInt();
    
    while(no_of_cars_per_rail < 36 || no_of_cars_per_rail > 48) //Validate input from user
    {
        if(no_of_cars_per_rail < 36)
        {
        System.out.print("No railcars have that low capacity. Try again:");
        no_of_cars_per_rail = input.nextInt();
        }
        else    
        {
        System.out.print("No railcars have that high capacity. Try again:");
        no_of_cars_per_rail = input.nextInt();  
        }
    }   
    System.out.print("Number of railcars available at "+ company_name +":");
    no_of_railcars = input.nextInt();

    while(no_of_railcars < 1) //Validate input from user
    {
    System.out.print("Error: Number of railcars that are available must at least 1. Try again:");
    no_of_railcars = input.nextInt();
    }
    
    System.out.println("----------------------------------------------------------");
    System.out.println("Mohammed Lateef's, Train Master Report for"+ " "+ company_name);   
    System.out.println("----------------------------------------------------------");

    //calculation for train master's report
    
    no_of_automobiles_can_not_ship = no_of_cars_to_ship - no_of_automobiles_can_ship;

    percent_no_of_Automobiles_can_ship = ((double)no_of_automobiles_can_ship / no_of_cars_to_ship);

    percent_no_of_Automobiles_cannot_ship = ((double)no_of_automobiles_can_not_ship / no_of_cars_to_ship)*100;

    no_of_railcars_needed = (int)Math.ceil((double)no_of_cars_to_ship/no_of_cars_per_rail); 

    // display report
    System.out.println("Required number of automobiles to ship:\t\t"+no_of_cars_to_ship);
    System.out.println("Minimum number of railcars required:\t\t"+no_of_railcars_needed);
    System.out.println("Number of railcars available:\t\t\t"+no_of_railcars);
    System.out.println("Number of automobiles that can be shipped:\t"+ +no_of_automobiles_can_not_ship + ", " + (percent_no_of_Automobiles_cannot_ship));
    System.out.println("Number of automobiles left behind:\t\t"+ no_of_automobiles_can_ship + ", "+ (percent_no_of_Automobiles_can_ship));
   

    // additional automobile
    if(no_of_cars_per_rail * no_of_railcars >= no_of_cars_to_ship) 
    {
    additional_automobiles = no_of_cars_per_rail * no_of_railcars - no_of_cars_to_ship;
    System.out.println("There would be room for an extra " +additional_automobiles + " automobiles on the railcars.");
    }

    //close scanner object
    input.close();

    }
}
