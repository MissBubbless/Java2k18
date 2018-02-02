package com.nym.thread1;

public class ProcessPayment{
	
	private Customer customer;

	public ProcessPayment(Customer cust) {
		this.customer = cust;
	}
	
	/*synchronized*/ public void withdrawal(double amount) {
		customer.balance=customer.balance-amount;
		System.out.println(customer.name+" Balance is :"  + customer.balance);
	}
	/*synchronized*/ public void deposit(double amount) {
		customer.balance=customer.balance+amount;
	    System.out.println(customer.name+" Balance is :"  + customer.balance);

	}
}
