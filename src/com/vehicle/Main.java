package com.vehicle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RentalService rentalService = new RentalService();
        int choice;

        do {

            System.out.println("\n===== Vehicle Rental System =====");
            System.out.println("1. Show Vehicles");
            System.out.println("2. Rent Vehicle");
            System.out.println("3. Return Vehicle");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    rentalService.showVehicles();
                    break;

                case 2:

                    System.out.print("Enter Vehicle ID: ");
                    int rentId = sc.nextInt();

                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();

                    rentalService.rentVehicle(rentId, days);

                    break;

                case 3:

                    System.out.print("Enter Vehicle ID: ");
                    int returnId = sc.nextInt();

                    rentalService.returnVehicle(returnId);

                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}