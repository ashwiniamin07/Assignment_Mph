package com.mph.TaxCalculationApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleService {
	ArrayList<Vehicle> vehicles = new ArrayList<>();
	private boolean isRegNoUnique(String reg) {
	    for (Vehicle v : vehicles) {
	        if (v.getRegNo().equals(reg)) {
	            return false;
	        }
	    }
	    return true;
	}


    public void addVehicle(Scanner sc) {
        try {
        	System.out.print("Enter registration number: ");
        	String reg = sc.next();
        	InputValidator.validateRegNo(reg);

        	if (!isRegNoUnique(reg)) {
        	    throw new InvalidInputException("Registration number must be unique.");
        	}

            System.out.print("Enter brand: ");
            String brand = sc.next();
            InputValidator.validateBrand(brand);

            System.out.print("Enter purchase cost: ");
            double cost = sc.nextDouble();
            InputValidator.validatePurchaseCost(cost);

            System.out.print("Enter max velocity: ");
            int vel = sc.nextInt();
            InputValidator.validateVelocity(vel);

            System.out.print("Enter no. of seats: ");
            int seats = sc.nextInt();
            InputValidator.validateSeats(seats);

            System.out.print("Enter vehicle type (1-Petrol, 2-Diesel, 3-CNG): ");
            int type = -1;
            try {
                type = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Vehicle type must be numeric (1-3).");
                sc.nextLine(); // clear buffer
                return;
            }
            InputValidator.validateType(type);


            Vehicle v = new Vehicle(reg, brand, vel, seats, type, cost);
            vehicles.add(v);
            System.out.println("Vehicle added successfully!");

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void calculateVehicleTax() {
        for (Vehicle v : vehicles) {
            v.calculateTax();
        }
        System.out.println("Vehicle tax calculated!");
    }

    public void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicle data found.");
            return;
        }

        System.out.println("REGNO      BRAND     VELOCITY   SEATS     TYPE       PURCHASE      TAX");
        System.out.println("--------------------------------------------------------------------");

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    public double getTotalVehicleTax() {
        return vehicles.stream().mapToDouble(Vehicle::getVehicleTax).sum();
    }

    // ⭐ MISSING METHOD (required by Main)
    public int getTotalVehicles() {
        return vehicles.size();
    }
    
    

}
