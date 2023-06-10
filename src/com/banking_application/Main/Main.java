package com.banking_application.Main;

import java.util.Scanner;

import com.banking_application.classes.Bank;
import com.banking_application.classes.Processing;

public class Main {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		Processing p1 = new Processing();
		boolean exit = false;
		String num ="";
		
		System.out.println("Enter your Name :");
		String name = sc.nextLine();
		p1.setName(name);
		
		do {
			
			System.out.println("Enter Account Number (Must be 5 digit) :");
			num = sc.nextLine();
			long accountnumber = Long.parseLong(num);
			p1.setAccountNumber(accountnumber);
		
		}while(num.length()<5 || num.length()>5);
		
		do {
			
			
			System.out.println("Enter the choise");
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Deposit Money");
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
			case 4 : p1.checkTransactions();
					break;
			case 5 : exit=true;
					break;
			default : System.out.println("Wrong Choise");
					break;
			}
		}while(!exit);
		} catch(Exception e){
			System.out.println("Opps Sorry the Account number is too big");
			System.out.println("Transaction Terminated");
		}
	}

}
