package exercises;

import java.util.Scanner;


public class Miles {
    public static void main(String[] args) {
        Scanner scannerMiles, scannerGallons;

        //ask user for miles input
        System.out.println("How many miles have you driven?");
        scannerMiles = new Scanner(System.in);
        int miles = scannerMiles.nextInt();

        System.out.println("you've driven " + miles + " miles.");

        // ask user for input of  gallon consumption
        System.out.println("How many gallons did you use?");
        scannerGallons = new Scanner(System.in);
        int gallons = scannerGallons.nextInt();

        System.out.println("You've used " + gallons + " gallons.");
        scannerGallons.close();

        int milesPerGallon = miles/gallons;
        System.out.println("you've used " + milesPerGallon + "miles per gallon.");

    }

}
