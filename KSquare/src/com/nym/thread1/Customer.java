package com.nym.thread1;

public class Customer {
	
	 public String name;
	 public double balance=10000;
	
	 public Customer() {}
	 public Customer(String name,double balance){
		 this.name=name;
		 this.balance=balance;
		 
	 }
	@Override
	public String toString() {
		return "Customer [name=" + name + ", balance=" + balance + "]";
	}
	
	 
}