package com.banking_application.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class Processing {
 

	private Bank bank;
	
	public Processing() {
		this.bank= new Bank();
	}
	Scanner sc = new Scanner(System.in);
	List<Transactions> mylist = new ArrayList<>();
	public void deposit() {
	
	
	System.out.println("Enter Amount to be deposited :");
	int amount = sc.nextInt();
	bank.setBalance(bank.getBalance()+amount);
	
    
	
	 
	mylist.add(new Transactions("Debited",amount,new Date(System.currentTimeMillis())));
	
	bank.setTransaction(mylist);
	}
	
	public int checkBalance() {
		int balance = bank.getBalance();
		return balance;
	}
	
	public void withdraw() {
		System.out.println("Enter the withdrawal amount :");
		int amount = sc.nextInt();
		
		if(bank.getBalance()<amount) {
			System.out.println("Sorry Not sufficient Balance");
		} else {
			int remaining=bank.getBalance()-amount;
			bank.setBalance(remaining);
			mylist.add(new Transactions("Credited",remaining,new Date(System.currentTimeMillis())));	
		}
		
	}
	public void checkTransactions() {
		
		List<Transactions> mylist =bank.getTransaction();
		for(int i=0;i<mylist.size();i++) {
			System.out.println(i+1+" "+mylist.get(i));
	}
	}
}
