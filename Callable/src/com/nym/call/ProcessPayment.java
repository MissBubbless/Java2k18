package com.nym.call;


public class ProcessPayment{
	
	private Customer customer;

	public ProcessPayment(Customer cust) {
		this.customer = cust;
	}
	
	synchronized public void withdrawal(double amount) {
		customer.balance=customer.balance-amount;
	}
	synchronized public void deposit(double amount) {
		customer.balance=customer.balance+amount;
	   }
}

