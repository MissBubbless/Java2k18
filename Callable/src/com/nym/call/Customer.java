package com.nym.call;

public class Customer {
	
	 String name;
	public double balance=10000;
	
	 public Customer() {}
	 public Customer(String name,double balance){
		 this.name=name;
		 this.balance=balance;
	 }

	public String toString() {
		return "Customer [name=" + name + ", balance=" + balance + "]";
	}
	
	 
}
