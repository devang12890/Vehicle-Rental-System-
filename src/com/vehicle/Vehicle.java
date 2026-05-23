package com.vehicle;

abstract class Vehicle {

    private int vehicleId;
    private String vehicleName;
    private double rentPerDay;
    private boolean isAvailable;

    public Vehicle(int vehicleId, String vehicleName, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.rentPerDay = rentPerDay;
        this.isAvailable = true;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    public abstract void displayDetails();
}