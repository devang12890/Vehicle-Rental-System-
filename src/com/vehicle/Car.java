package com.vehicle;

class Car extends Vehicle {

    public Car(int vehicleId, String vehicleName, double rentPerDay) {
        super(vehicleId, vehicleName, rentPerDay);
    }

    @Override
    public void displayDetails() {
        System.out.println("Car ID: " + getVehicleId());
        System.out.println("Car Name: " + getVehicleName());
        System.out.println("Rent Per Day: ₹" + getRentPerDay());
        System.out.println("Available: " + isAvailable());
        System.out.println("---------------------------");
    }
}