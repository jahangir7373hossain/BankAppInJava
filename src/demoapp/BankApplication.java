package demoapp;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

    int balance;
	public static Scanner sc;

	public static void userName() {
		boolean foundUser = false;
		ArrayList<String> uName = new ArrayList<String>();
		uName.add("Jahangir");
		uName.add("Hossain");
		uName.add("Khan");
		System.out.println("Enter your name: ");
		sc = new Scanner(System.in);
		String usrName = sc.nextLine();
		search: for (int i = 0; i < uName.size(); i++) {
			if (uName.get(i).contains(usrName)) {
				foundUser = true;
				break search;
			}
		}

		if (foundUser) {
			System.out.println("User name is correct!");
		} else {
			System.out.println("' " + usrName + " ' " + "User name is not correct. Enter valid user name");
			System.exit(0);
		}
		
	}

	public static void password() {
		boolean foundPass = false;
		ArrayList<Integer> passwordList = new ArrayList<Integer>();
		passwordList.add(1234);
		passwordList.add(5678);
		passwordList.add(9101);
		System.out.println("Enter the password: ");
		sc = new Scanner(System.in);
		int inputPass = sc.nextInt();
		search: for (int i = 0; i < passwordList.size(); i++) {
			if (passwordList.get(i) == inputPass) {
				foundPass = true;
				break search;
			}
		}
		if(foundPass) {
			System.out.println("Password is correct!");
		}else {
			System.out.println("' " + inputPass + " ' " + "Password is not correct. Enter valid password");
			System.exit(0);
		}

	}
	
	public void deposit() {
		System.out.println("Enter the deposite amount: ");
		sc = new Scanner(System.in);
		int depositAmaount = sc.nextInt();
		balance = balance + depositAmaount;		
		System.out.println("After deposit total balace is : " + balance);		
	}
	
	public void withdraw() {
		
		System.out.println("Enter the amount to be withdrwed:");
		sc = new Scanner(System.in);
		int withdrawAmount = sc.nextInt();
		System.out.println("After withdraw total balance is: "+ balance);
		if(withdrawAmount > balance) {
			System.out.println("Withdraw amount is higher than total amount.Sorry operation can not perform");
		}
	}

	public void operationType() {
		String deposite = "d";
		String withdraw = "w";
		String balanceCheck = "b";
		System.out.println("Choose the transection type:");
		System.out.println("d-Deposit\nw-Withdraw\nb-Balance");
		System.out.println("Enter transection to be performed: ");
		sc = new Scanner(System.in);
		String operation = sc.nextLine();
		if(operation.equalsIgnoreCase(deposite)) {
			deposit();
		}else if (operation.equalsIgnoreCase(withdraw)) {
			withdraw();
		}else if(operation.equalsIgnoreCase(balanceCheck)) {
			int bal = balance;
			System.out.println("Your total balance is : "+ bal);
		}
	}
	
	public static void main(String[] args) {
		BankApplication BA = new BankApplication();
		while (true) {
			userName();
			password();
			BA.operationType();

		}

	}

}
