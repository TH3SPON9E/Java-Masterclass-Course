package com.nmbrookes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Bank> banks = new ArrayList<Bank>();

	public static void main(String[] args) {
		boolean quit = false;
		printActions();

		while (!quit) {
			System.out.println("Enter choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 0:
					quit = true;
					break;
				case 1:
					System.out.println("Enter bank name: ");
					String bankName = scanner.nextLine();
					addBank(bankName.toLowerCase());
					break;
				case 2:
					System.out.println("Enter bank name: ");
					String existingBankName = scanner.nextLine();
					System.out.println("Enter branch name: ");
					String branchName = scanner.nextLine();
					addBranch(existingBankName.toLowerCase(), branchName.toLowerCase());
					break;
				case 3:
					System.out.println("Enter bank name: ");
					String bankToAddCustomer = scanner.nextLine();
					System.out.println("Enter branch name: ");
					String branchToAddCustomer = scanner.nextLine();
					System.out.println("Enter customer name: ");
					String customerName = scanner.nextLine();
					System.out.println("Enter initial amount");
					double initialAmount = scanner.nextDouble();
					scanner.nextLine();
					addCustomer(bankToAddCustomer.toLowerCase(), branchToAddCustomer.toLowerCase(),
							customerName.toLowerCase(), initialAmount);
					break;
				case 4:
					System.out.println("Enter bank name: ");
					String bankToAddTransaction = scanner.nextLine();
					System.out.println("Enter branch name: ");
					String branchToAddTransaction = scanner.nextLine();
					System.out.println("Enter customer name: ");
					String customerNameToAddTransaction = scanner.nextLine();
					System.out.println("Enter amount");
					double amount = scanner.nextDouble();
					scanner.nextLine();
					addTransaction(bankToAddTransaction.toLowerCase(), branchToAddTransaction.toLowerCase(),
							customerNameToAddTransaction.toLowerCase(), amount);
					break;
				case 5:
					System.out.println("Enter bank name to remove: ");
					String bankNameRemove = scanner.nextLine();
					bankRemove(bankNameRemove.toLowerCase());
					break;
				case 6:
					System.out.println("Enter bank name: ");
					String bankNameToRemoveBranch = scanner.nextLine();
					System.out.println("Enter branch to remove");
					String branchToRemove = scanner.nextLine();
					removeBranch(bankNameToRemoveBranch.toLowerCase(), branchToRemove.toLowerCase());
					break;
				case 7:
					System.out.println("Enter bank name: ");
					String bankToRemoveCustomer = scanner.nextLine();
					System.out.println("Enter branch name: ");
					String branchToRemoveCustomer = scanner.nextLine();
					System.out.println("Enter customer name: ");
					String customerToRemove = scanner.nextLine();
					removeCustomer(bankToRemoveCustomer.toLowerCase(), branchToRemoveCustomer.toLowerCase(),
							customerToRemove.toLowerCase());
					break;
				case 8:
					showBanks();
					break;
				case 9:
					System.out.println("Enter bank name: ");
					String existingBankNameForBranches = scanner.nextLine();
					showBranches(existingBankNameForBranches.toLowerCase());
					break;
				case 10:
					System.out.println("Enter Bank name");
					String bankToFindCustomers = scanner.nextLine();
					System.out.println("Enter Branch name");
					String branchToFindCustomers = scanner.nextLine();
					System.out.println("Show transactions (y/n)");
					String showTransactionAnswer = scanner.nextLine();
					listCustomers(bankToFindCustomers.toLowerCase(), branchToFindCustomers.toLowerCase(),
							showTransactionAnswer.toLowerCase());
					break;
				case 11:
					printActions();
					break;
			}
		}
	}

	// Option 1
	private static void addBank(String bankName) {
		Bank bank = new Bank(bankName);
		for(int i = 0; i < banks.size(); i++) {
			if(banks.get(i).getBankName().equals(bankName)) {
				System.out.println("Bank: " + bankName + " already exists.");
				return;
			}
		}
		banks.add(bank);
	}

	// Option 2
	private static void addBranch(String bankName, String branchName) {
		Bank bank = getBank(bankName);
		if(bank != null) {
			if(bank.addBranch(branchName)) {
				bank.addBranch(branchName);
				return;
			}
			System.out.println("Error adding branch");
			return;
		}
		System.out.println("Bank " + bankName + " does not exists.");
	}

	// Option 3
	private static void addCustomer(String bankName, String branchName, String customerName, double initialAmount) {
		Bank bank = getBank(bankName);
		if (bank != null) {
			if(bank.addCustomer(branchName, customerName, initialAmount)) {
				bank.addCustomer(branchName, customerName, initialAmount);
				return;
			}
			System.out.println("Error adding customer");
			return;
		}
		System.out.println("Bank " + bankName + " does not exists.");
	}

	// Option 4
	private static void addTransaction(String bankName, String branchName, String customerName, double amount) {
		Bank bank = getBank(bankName);
		if (bank != null) {
			if(bank.addTransaction(branchName, customerName, amount)) {
				bank.addTransaction(branchName, customerName, amount);
				return;
			}
			System.out.println("Error adding transaction");
		}
		System.out.println("Bank " + bankName + " does not exists.");
	}

	// Option 5
	private static void bankRemove(String bankName) {
		int index = findBankIndex(bankName);
		if(index >= 0) {
			banks.remove(index);
			return;
		}
		System.out.println("Bank " + bankName + " does not exists.");
	}

	// Option 6
	private static void removeBranch(String bankName, String branchName) {
		Bank bank = getBank(bankName);
		if(bank != null) {
			if(bank.removeBranch(branchName)) {
				bank.removeBranch(branchName);
				return;
			}
			System.out.println("Error adding transaction");
			return;
		}
		System.out.println("Bank " + bankName + " does not exists.");
	}

	// Option 7
	private static void removeCustomer(String bankName, String branchName, String customerName) {
		Bank bank = getBank(bankName);
		if (bank != null) {
			if(bank.removeCustomer(branchName, customerName)) {
				bank.removeCustomer(branchName, customerName);
				return;
			}
			System.out.println("Error removing customer");
			return;
		}
		System.out.println("Bank " + bankName + " does not exists.");
	}

	// Option 8
	private static void showBanks() {
		System.out.println("Banks");
		for(int i = 0; i < banks.size(); i++) {
			System.out.println((i + 1) + ": " + banks.get(i).getBankName());
		}
	}

	// Option 9
	private static void showBranches(String bankName) {
		Bank bank = getBank(bankName);
		if (bank != null) {
			bank.showBranches();
			return;
		}
		System.out.println("Bank " + bankName + " does not exists.");
	}

	// Option 10
	private static void listCustomers(String bankName, String branchName, String showTransactions) {
		boolean showTransactionBoolean = showTransactions.toLowerCase().equals("y");
		Bank bank = getBank(bankName);
		if (bank != null) {
			if(bank.listCustomer(branchName, showTransactionBoolean)) {
				bank.listCustomer(branchName, showTransactionBoolean);
				return;
			}
			System.out.println("Error showing customers");
			return;
		}
		System.out.println("Bank " + bankName + " does not exists.");
	}

	// Option 11
	private static void printActions() {
		System.out.println("Actions:");
		System.out.println("0 - Quit" +
				"\n1 - Add new bank" +
				"\n2 - Add new branch" +
				"\n3 - Add new customer" +
				"\n4 - Add new transaction" +
				"\n5 - Remove bank" +
				"\n6 - Remove branch" +
				"\n7 - Remove customer" +
				"\n8 - List banks" +
				"\n9 - List branches" +
				"\n10 - List customers" +
				"\n11 - Show Actions");
	}

	private static Bank getBank(String bankName) {
		int index = findBankIndex(bankName);
		if(index != -1) {
			return banks.get(index);
		}
		return null;
	}

	private static int findBankIndex(String bankName) {
		for(int i = 0; i < banks.size(); i++) {
			if(banks.get(i).getBankName().equals(bankName)) {
				return i;
			}
		}
		return -1;
	}
}
