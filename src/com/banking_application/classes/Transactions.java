package com.banking_application.classes;

import java.util.Date;

public class Transactions {

	private String transactiontype;
	private int amount;
	private Date date;
	public Transactions(String transactiontype, int amount, Date date) {
		super();
		this.transactiontype = transactiontype;
		this.amount = amount;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transactions [transactiontype=" + transactiontype + ", amount=" + amount + ", date=" + date + "]";
	}
	
	
	
	
     
}
