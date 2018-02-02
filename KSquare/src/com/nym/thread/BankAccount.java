package com.nym.thread;

public class BankAccount {

	public static void main(String[] args) {
		
		ProcessPayment p1=new ProcessPayment("Nymisha",123456);
		ProcessPayment p2=new ProcessPayment("Anand",65341);
		
		p1.withdrawal(1000);	
		p2.deposit(500);
		
	}

}
