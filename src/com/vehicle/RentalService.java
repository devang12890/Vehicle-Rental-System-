package com.vehicle;

class RentalService {

    Vehicle[] vehicles = new Vehicle[4];

    public RentalService() {

        vehicles[0] = new Car(1, "Swift", 2000);
        vehicles[1] = new Car(2, "Creta", 3500);

        vehicles[2] = new Bike(3, "Royal Enfield", 1200);
        vehicles[3] = new Bike(4, "Pulsar", 800);
    }

    public void showVehicles() {

        System.out.println("\n===== Available Vehicles =====");

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
        }
    }

    public void rentVehicle(int vehicleId, int days) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getVehicleId() == vehicleId) {

                if (vehicle.isAvailable()) {

                    vehicle.setAvailable(false);

                    double totalRent = vehicle.calculateRent(days);

                    System.out.println("\nVehicle Rented Successfully!");
                    System.out.println("Vehicle: " + vehicle.getVehicleName());
                    System.out.println("Days: " + days);
                    System.out.println("Total Rent: ₹" + totalRent);

                } else {
                    System.out.println("\nVehicle is already rented.");
                }

                return;
            }
        }

        System.out.println("\nVehicle not found.");
    }

    public void returnVehicle(int vehicleId) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getVehicleId() == vehicleId) {

                if (!vehicle.isAvailable()) {

                    vehicle.setAvailable(true);

                    System.out.println("\nVehicle Returned Successfully!");

                } else {
                    System.out.println("\nVehicle was not rented.");
                }

                return;
            }
        }

        System.out.println("\nVehicle not found.");
    }
}