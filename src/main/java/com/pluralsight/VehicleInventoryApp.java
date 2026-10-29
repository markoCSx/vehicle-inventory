package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class VehicleInventoryApp {

    public static Scanner userInput = new Scanner(System.in);
    public static String userText;

    public static void main(String[] args) {

        Vehicle[] vInventory = new Vehicle[20];
        vInventory[0] = new Vehicle(101121, "Ford Explorer", "Red" , 45000, 13500);
        vInventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vInventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vInventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vInventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vInventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        boolean done = false;
        do {
            System.out.print("""
                    What do you want to do?
                    1 - List all vehicles
                    2 - Search by make/model
                    3 - Search by price range
                    4 - Search by color
                    5 - Add a vehicle
                    6 - Quit
                    """);
            int answer = 0;
            while (answer <= 0 || answer > 6) {
                System.out.println("Enter your command: ");
                userText = userInput.nextLine();
                answer = Integer.parseInt(userText);
            }
            switch (answer) {
                case 1 -> {
                    for (int i = 0; i < vInventory.length && vInventory[i] != null; i++) {
                        vInventory[i].getData();
                    }
                }
                case 2 -> {
                    System.out.print("Enter Make/Model: ");
                    userText = userInput.nextLine();
                    int tags = 0;
                    for (int i = 0; i < vInventory.length && vInventory[i] != null; i++) {
                        if (vInventory[i].getMakeModel().equalsIgnoreCase(userText)) {
                            vInventory[i].getData();
                            tags += 1;
                        }
                    }
                    if (tags == 0) {
                        System.out.println("None found");
                    }
                }
                case 3 -> {
                    double num1 = 0;
                    double num2 = 0;
                    do {
                        if (num1 < 0 || num2 < 0) {
                            System.out.println("\n--------Invalid Range--------\n");
                        }
                        System.out.println("Enter price range");
                        userText = userInput.nextLine();
                        num1 = converter(userText);
                        System.out.print(userText + " - ");
                        userText = userInput.nextLine();
                        num2 = converter(userText);
                        System.out.printf("-------- (%.2f - %.2f) --------\n", num1, num2);
                    } while (num1 < 0 || num2 < 0);
                    double bigNum = num2;
                    double smallNum = num1;
                    if (num1 > num2) {
                        smallNum = num2;
                        bigNum = num1;
                    }
                    String[] sortHold;
                    double[] prices;
                    String HOLD = "";
                    for (int i = 0; i < vInventory.length; i++) {
                        if (vInventory[i] == null) {
                            break;
                        }
                        if (vInventory[i].getPrice() >= smallNum && vInventory[i].getPrice() <= bigNum) {
                            HOLD += String.format("%.2f%d|", vInventory[i].getPrice(), i);
                        }
                    }
                    if (HOLD != "") {
                        sortHold = HOLD.split("\\|");
                        prices = new double[sortHold.length];
                        for (int i = 0; i < sortHold.length; i++) {
                            prices[i] = Double.parseDouble(sortHold[i]);
                        }
                        Arrays.sort(prices);
                        for (int i = 0; i < prices.length; i++) {
                            int lastDigit = (int) (prices[i] * 1000 + 0.5) % 10;
                            vInventory[lastDigit].getData();
                        }
                    } else {
                        System.out.println("\n--------- Zero Vehicles Found ---------");
                    }

                }
                case 4 -> {

                }
                case 5 -> {
                    for (int i = 0; i < vInventory.length; i++) {
                        if (String.format("%s", vInventory[i]).equalsIgnoreCase("null")) {
                            vInventory[i] = new Vehicle();
                            vInventory[i].setData();
                            break;
                        }
                    }
                }
                case 6 -> {
                    done = true;
                }
                default -> {
                    System.out.println("Invalid\n");
                }
            }
        }
        while (done == false);
        userInput.close();
    }

    public static double converter(String text) {
        String[] priceRange = text.split("\\,");
        String placeHolder = "";
        for (String numbers : priceRange){
            placeHolder += numbers;
        }
        double number = Double.parseDouble(placeHolder);
        return number;
    }

}
