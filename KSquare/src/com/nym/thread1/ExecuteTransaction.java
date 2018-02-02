package com.nym.thread1;

import java.util.concurrent.Callable;

//public class ExecuteTransaction extends Thread
public class ExecuteTransaction implements Runnable, Callable<String>
{

	private Customer customer;//customer reference can hold a customer object
	public ExecuteTransaction(Customer cust)
	{
		this.customer = cust;
	}
	public void run() {
		ProcessPayment p= new ProcessPayment(customer);
		  /* try
		   		{  */
		p.deposit(100);
		p.deposit(200);
		p.withdrawal(50);
		   	/*	}
		   catch(ArithmeticException e)
		   {
			   System.out.println(e);
			   }*/
		try{  
		      int data=50/0;  
		   }catch(ArithmeticException e){System.out.println(e);}  
	}
}

