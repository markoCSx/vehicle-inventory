package com.pluralsight;

import java.util.Scanner;

public class VehicleInventoryApp {

    static Scanner userInput = new Scanner(System.in);
    static String userText;

    public static void main(String[] args) {

        Vehicle[] vInventory = new Vehicle[20];
        vInventory[0] = new Vehicle(101121, "Ford Explorer", "Red" , 45000, 13500);
        vInventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vInventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vInventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vInventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vInventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        System.out.print("""
                What do you want to do?
                1 - List all vehicles
                2 - Search by make/model
                3 - Search by price range
                4 - Search by color
                5 - Add a vehicle
                6 - Quit
                Enter your command:\t""");
        userText = userInput.nextLine();
        int answer = Integer.parseInt(userText);
        switch (answer) {
            case 1 -> {
                for (int i = 0; i < 6; i++) {
                    System.out.println("Vehicle ID: " + vInventory[i].getVehicleId());
                    System.out.println("Vehicle Model: " + vInventory[i].getMakeModel());
                    System.out.println("Vehicle Color: " + vInventory[i].getColor());
                    System.out.println("Vehicle Odometer Reading: " + vInventory[i].getOdometerReading());
                    System.out.println("Vehicle Price: " + vInventory[i].getPrice());
                    System.out.println("----------------------------------------------");
                }
            }
            /*case 2 ->
            case 3 ->
            case 4 ->
            case 5 ->
            case 6 ->*/
        }

        userInput.close();
    }
}
