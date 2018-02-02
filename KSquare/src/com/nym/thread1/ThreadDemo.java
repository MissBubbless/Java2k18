package com.nym.thread1;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {

	public static void main(String[] args) {
		
		ArrayList<Customer> list=new ArrayList<Customer>();
		/*ExecutorService excutor=Executors.newFixedThreadPool(10);*/
		for(int i=0;i<100;i++) {
			list.add(new Customer("Customer"+i,10000));
		}
		
		for(Customer c:list) {
			//Thread t=new ExecuteTransaction(c);
			ExecuteTransaction et=new ExecuteTransaction(c);
			Thread t=new Thread(et);
						t.start();		
			/*ExecuteTransaction et=new ExecuteTransaction();*/
			
		}
		/*while(true) {	
		}
		*///chck for a program termianation 
	}}
