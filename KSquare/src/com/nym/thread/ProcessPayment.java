package com.nym.thread;

public class ProcessPayment extends Customer {
	
	public ProcessPayment(String name, int accountno) {
		super(name, accountno);
		// TODO Auto-generated constructor stub
	}
	double amount;
	
	public void withdrawal(double amount) {
		balance=balance-amount;
		System.out.println(name+" Balance is :"  + balance);
	}
	public void deposit(double amount) {
		balance=balance+amount;
	    System.out.println(name+" Balance is :"  + balance);

	}
	
}
