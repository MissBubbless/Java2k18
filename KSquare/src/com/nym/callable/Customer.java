package com.nym.callable;

public class Customer {
	
	 String name;
	public double balance=10000;
	// String operation;
	 public Customer() {}
	 public Customer(String name,double balance){
		 this.name=name;
		 this.balance=balance;
		 //this.operation=operation;
	 }
	@Override
	public String toString() {
		return "Customer [name=" + name + ", balance=" + balance + "]";
	}
	
	 
}
