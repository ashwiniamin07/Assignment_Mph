package com.mph.BankingApp;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SavingAccount sa = new SavingAccount(12345678, "Ashwini", "ICICI", "ICIC0004567", "Hyderabad", 5000);
		CurrentAccount ca = new CurrentAccount(98765432, "Ashwini", "HDFC", "HDFC0087654", "Bangalore", 10000, 5000);

		while (true) {
			System.out.println("\n==== Banking Menu ====");
			System.out.println("1. Saving Account");
			System.out.println("2. Current Account");
			System.out.println("3. Exit");
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				savingAccountMenu(sa, sc);
				break;

			case 2:
				currentAccountMenu(ca, sc);
				break;

			case 3:
				System.out.println("Thank you for banking with us!");
				System.exit(0);

			default:
				System.out.println("Invalid Choice!");
			}
		}
	}

	// ---------------- Saving Account Menu ------------------------

	public static void savingAccountMenu(SavingAccount sa, Scanner sc) {

		while (true) {
			System.out.println("\n--- Saving Account Menu ---");
			System.out.println("1. Check Details");
			System.out.println("2. Check Balance");
			System.out.println("3. Withdraw");
			System.out.println("4. Deposit");
			System.out.println("5. Change PIN");
			System.out.println("6. Back");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				sa.checkDetails();
				break;

			case 2:
				System.out.println("Balance: " + sa.checkBalance());
				break;

			case 3:
				System.out.print("Enter Amount: ");
				sa.withDraw(sc.nextDouble());
				break;

			case 4:
				System.out.print("Enter Amount: ");
				sa.deposit(sc.nextDouble());
				break;

			case 5:
				System.out.print("Enter New PIN: ");
				sa.changePin(sc.nextInt());
				break;

			case 6:
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	// ---------------- Current Account Menu ------------------------

	public static void currentAccountMenu(CurrentAccount ca, Scanner sc) {

		while (true) {
			System.out.println("\n--- Current Account Menu ---");
			System.out.println("1. Check Details");
			System.out.println("2. Check Overdraft Limit");
			System.out.println("3. Withdraw");
			System.out.println("4. Deposit");
			System.out.println("5. Change PIN");
			System.out.println("6. Back");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				ca.checkDetails();
				break;

			case 2:
				System.out.println("Overdraft Limit: " + ca.checkOverDraftLimit());
				break;

			case 3:
				System.out.print("Enter Amount: ");
				ca.withDraw(sc.nextDouble());
				break;

			case 4:
				System.out.print("Enter Amount: ");
				ca.deposit(sc.nextDouble());
				break;

			case 5:
				System.out.print("Enter New PIN: ");
				ca.changePin(sc.nextInt());
				break;

			case 6:
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	}


