package com.pluralsight;

public class VehicleInventoryApp {

    public static void main(String[] args) {

        Vehicle[] vInventory = new Vehicle[20];
        vInventory[0] = new Vehicle(101121, "Ford Explorer", "Red" , 45000, 13500);
        vInventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vInventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vInventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vInventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vInventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

    }
}
