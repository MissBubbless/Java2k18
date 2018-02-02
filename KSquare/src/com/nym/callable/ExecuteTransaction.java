package com.nym.callable;

import java.util.concurrent.Callable;

import com.nym.thread1.Customer;
import com.nym.thread1.ProcessPayment;

public class ExecuteTransaction implements Callable<String>
{

	private Customer customer; //customer reference can hold a customer object
	public ExecuteTransaction(Customer cust)
	{
		this.customer = cust;
	}
	
	public String call() throws Exception {
		
		ProcessPayment p= new ProcessPayment(customer); 
		if((customer.name).equals("Customer33")) 
		{
			System.out.println("HELLLLLLLLLLLLLLLLLLLl");
		try{  
		      int data=50/0;  
		   }
		catch(ArithmeticException e){
			return customer.name+": Transaction failed";
		   }  
		 }
		p.deposit(100);
		p.deposit(200);
		p.withdrawal(50);
		  
		return customer.name+" Balance is :"  + customer.balance;
	}
}

