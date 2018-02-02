package com.nym.Practice;

public class ThreadDemo {

	public static void main(String[] args) {
		RunnableClass r =new RunnableClass();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
		
	}

}
