package com.mphasis.TaxCalculationApp.main;

import java.util.Scanner;

import com.mphasis.TaxCalculationApp.auth.Login;
import com.mphasis.TaxCalculationApp.service.PropertyService;
import com.mphasis.TaxCalculationApp.service.VehicleService;

public class Main {
	 // ---------- TOTAL DISPLAY METHOD ----------
    public void displayTotal(int propertyCount, double propertyTax,
                             int vehicleCount, double vehicleTax) {

        int totalCount = propertyCount + vehicleCount;
        double totalTax = propertyTax + vehicleTax;

        System.out.println("\nSR. NO.\t PARTICULAR   QUANTITY       TAX");

        System.out.printf("%-8d  %-12s  %-10d  %.2f\n",
                1, "PROPERTIES", propertyCount, propertyTax);

        System.out.printf("%-8d  %-12s  %-10d  %.2f\n",
                2, "VEHICLES", vehicleCount, vehicleTax);

        System.out.println();

        System.out.printf("%-10s  %-12s  %-10d  %.2f\n",
                "TOTAL", "", totalCount, totalTax);
    }



    // ---------- MAIN ----------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Login login = new Login();
        PropertyService ps = new PropertyService();
        VehicleService vs = new VehicleService();
        Main obj = new Main();

        System.out.println("WELCOME TO TAX CALCULATION APP");

        boolean loggedIn = false;
        int attempts = 0;

        while (attempts < 3) {
            if (login.doLogin(sc)) {
                loggedIn = true;
                break;
            } else {
                attempts++;
                System.out.println("Wrong username or password. Attempts left: " + (3 - attempts));
            }
        }

        if (!loggedIn) {
            System.out.println("Too many failed attempts. Exiting...");
            return;
        }


        while (true) {

            System.out.println("\n1. PROPERTY TAX");
            System.out.println("2. VEHICLE TAX");
            System.out.println("3. TOTAL");
            System.out.println("4. EXIT");
            System.out.print("Enter choice: ");

            int ch = -1;
            try {
                ch = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a numeric choice.");
                sc.nextLine(); // clear buffer
                continue;
            }

            switch (ch) {

                case 1:
                    propertyMenu(sc, ps);
                    break;

                case 2:
                    vehicleMenu(sc, vs);
                    break;

                case 3:
                    // Fetch totals from Service Classes
                    int propertyCount = ps.getTotalProperties();
                    double propertyTax = ps.getTotalPropertyTax();

                    int vehicleCount = vs.getTotalVehicles();
                    double vehicleTax = vs.getTotalVehicleTax();

                    obj.displayTotal(propertyCount, propertyTax, vehicleCount, vehicleTax);
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }



    // ---------- PROPERTY MENU ----------
    private static void propertyMenu(Scanner sc, PropertyService ps) {

        while (true) {
            System.out.println("\n1. ADD PROPERTY DETAILS");
            System.out.println("2. CALCULATE PROPERTY TAX");
            System.out.println("3. DISPLAY ALL PROPERTIES");
            System.out.println("4. BACK TO MAIN MENU");

            int c = -1;
            try {
                c = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a numeric choice.");
                sc.nextLine(); // clear buffer
                continue;
            }

            switch (c) {
                case 1: ps.addProperty(sc); break;
                case 2: ps.calculatePropertyTax(); break;
                case 3: ps.displayProperties(); break;
                case 4: return;
                default: System.out.println("Invalid choice!");
            }
        }
    }



    // ---------- VEHICLE MENU ----------
    private static void vehicleMenu(Scanner sc, VehicleService vs) {

        while (true) {
            System.out.println("\n1. ADD VEHICLE DETAILS");
            System.out.println("2. CALCULATE VEHICLE TAX");
            System.out.println("3. DISPLAY ALL VEHICLES");
            System.out.println("4. BACK TO MAIN MENU");

            int c = -1;
            try {
                c = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a numeric choice.");
                sc.nextLine(); // clear buffer
                continue;
            }

            switch (c) {
                case 1: vs.addVehicle(sc); break;
                case 2: vs.calculateVehicleTax(); break;
                case 3: vs.displayVehicles(); break;
                case 4: return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

	}


