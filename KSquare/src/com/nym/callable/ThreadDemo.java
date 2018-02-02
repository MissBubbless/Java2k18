package com.nym.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.nym.thread1.Customer;
import com.nym.thread1.ExecuteTransaction;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService pool=Executors.newFixedThreadPool(10);
		List<Future<String>> listOfFutures = new ArrayList<Future<String>>();
		
		for(int i=0;i<100;i++) {
			Callable<String> callableTransaction=   new ExecuteTransaction(new Customer("Customer"+i,10000));
			Future<String> futureResult=(Future<String>) pool.submit(callableTransaction);
			listOfFutures.add(futureResult);
		}
		
		for(Future<String> str:listOfFutures) {
			
			System.out.println(str.get());		
			
		}
		
	}}
