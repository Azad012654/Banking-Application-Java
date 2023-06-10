package com.banking_application.Main;

import java.util.Scanner;

import com.banking_application.classes.Bank;
import com.banking_application.classes.Processing;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b1 = new Bank();
		Processing p1 = new Processing();
		boolean exit = false;
		
		System.out.println("Enter your Name :");
		String name = sc.nextLine();
		b1.setName(name);
		
		String num ="";
		
		do {
		System.out.println("Enter Account Number (Must be 5 digit) :");
		num = sc.nextLine();
		int accountnumber = Integer.parseInt(num);
		b1.setAccount_number(accountnumber);
		}while(num.length()<5);
		do {
			System.out.println("Enter the choise");
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Deposit Balance");
			System.out.println("4. Check previous Transactions");
			System.out.println("5. Exit");
			int input =sc.nextInt();
			switch(input) {
			case 1 :
					System.out.println(p1.checkBalance());
					break;
			case 2 : p1.withdraw();
					break;
			case 3 : p1.deposit();
					break;
			case 4 : System.out.println("Customer Name : "+b1.getName());
					 System.out.println("Account Number : "+b1.getAccount_number()); 
				
				p1.checkTransactions();
						break;
			case 5 : exit=true;
					break;
			default : System.out.println("Wrong Choise");
						break;
			}
		}while(!exit);
	}

}
