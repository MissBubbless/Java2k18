package com.nym.Practice;

public class RunnableClass implements Runnable{

	synchronized public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName());
	}
	
	
}
