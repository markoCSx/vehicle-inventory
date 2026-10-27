package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;


    public Vehicle() {
        vehicleId = 111_111;
        makeModel = "Unset";
        color = "Unset";
        odometerReading = 11_111;
        price = 0;
    }

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, double price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public void getData() {
        System.out.println("Vehicle ID: " + this.vehicleId);
        System.out.println("Vehicle Model: " + this.makeModel);
        System.out.println("Vehicle Color: " + this.color);
        System.out.println("Vehicle Odometer Reading: " + this.odometerReading);
        System.out.println("Vehicle Price: " + this.price);
        System.out.println("----------------------------------------------");
    }

    public void setData() {
        System.out.println("Enter Vehicle ID: ");
        setVehicleId(Long.parseLong(VehicleInventoryApp.userInput.nextLine()));

        System.out.println("Enter Vehicle Model: ");
        setMakeModel(VehicleInventoryApp.userInput.nextLine());

        System.out.println("Enter Vehicle Color: ");
        setColor(VehicleInventoryApp.userInput.nextLine());

        System.out.println("Enter Vehicle Odometer Reading: ");
        setOdometerReading(Integer.parseInt(VehicleInventoryApp.userInput.nextLine()));

        System.out.println("Enter Vehicle Price: ");
        setPrice(Double.parseDouble(VehicleInventoryApp.userInput.nextLine()));

        System.out.println("----------------------------------------------");
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
