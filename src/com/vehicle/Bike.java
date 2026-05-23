package com.vehicle;

class Bike extends Vehicle {

    public Bike(int vehicleId, String vehicleName, double rentPerDay) {
        super(vehicleId, vehicleName, rentPerDay);
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike ID: " + getVehicleId());
        System.out.println("Bike Name: " + getVehicleName());
        System.out.println("Rent Per Day: ₹" + getRentPerDay());
        System.out.println("Available: " + isAvailable());
        System.out.println("---------------------------");
    }
}