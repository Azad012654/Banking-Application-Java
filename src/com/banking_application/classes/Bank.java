package com.banking_application.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Bank {

	private int account_number;
	private int balance=20;
	private List<Transactions> transaction;
	private String name;
	
	
	
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
		System.out.println("Balance Set :"+balance);
	}
	public List<Transactions> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transactions> transaction) {
		this.transaction = transaction;
	}
	
	
	
}
