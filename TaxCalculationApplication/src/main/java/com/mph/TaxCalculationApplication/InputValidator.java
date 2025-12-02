package com.mph.TaxCalculationApplication;

public class InputValidator {
	 // ---------- PROPERTY VALIDATIONS ----------
    public static void validateBaseValue(double base) throws InvalidInputException {
        if (base <= 0) throw new InvalidInputException("Base value must be positive and non-zero.");
    }

    public static void validateArea(double area) throws InvalidInputException {
        if (area <= 0) throw new InvalidInputException("Built-up area must be positive and non-zero.");
    }

    public static void validateAge(int age) throws InvalidInputException {
        if (age <= 0) throw new InvalidInputException("Age must be positive and non-zero.");
    }

    public static void validateCity(char city) throws InvalidInputException {
        city = Character.toUpperCase(city);
        if (city != 'Y' && city != 'N') {
            throw new InvalidInputException("City flag must be Y or N.");
        }
    }

    // ---------- VEHICLE VALIDATIONS ----------
    public static void validateRegNo(String reg) throws InvalidInputException {
        if (!reg.matches("\\d{4}") || reg.equals("0000")) {
            throw new InvalidInputException("Registration number must be positive 4 digits and not 0000.");
        }
    }

    public static void validateBrand(String brand) throws InvalidInputException {
        if (!brand.matches("[a-zA-Z]+")) {
            throw new InvalidInputException("Brand must contain only alphabets.");
        }
    }

    public static void validatePurchaseCost(double cost) throws InvalidInputException {
        if (cost < 50000 || cost > 1000000) {
            throw new InvalidInputException("Purchase cost must be between 50,000 and 1,000,000.");
        }
    }

    public static void validateVelocity(int vel) throws InvalidInputException {
        if (vel < 120 || vel > 300) {
            throw new InvalidInputException("Velocity must be between 120 and 300 kmph.");
        }
    }

    public static void validateSeats(int seats) throws InvalidInputException {
        if (seats < 2 || seats > 50) {
            throw new InvalidInputException("Seats must be between 2 and 50.");
        }
    }

    public static void validateType(int type) throws InvalidInputException {
        if (type < 1 || type > 3) {
            throw new InvalidInputException("Type must be 1 (Petrol), 2 (Diesel), or 3 (CNG).");
        }
    }
}
