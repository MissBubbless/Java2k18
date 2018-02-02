package com.nym.Practice;

import java.util.ArrayList;
import java.util.Collections;

class Twowheeler extends Vehicle
{
	int noofwheel;
	Twowheeler(String r,int m,int n)
	{
		super(r,m);
		noofwheel=n;
	}
	void display()
	{
		System.out.println("Two wheeler tvs");
		super.display();
		System.out.println("No. of wheel : " +noofwheel);
	}
}

class Threewheeler extends Vehicle
{
	int noofleaf;
	Threewheeler(String r,int m,int n)
	{
		super(r,m);
		noofleaf=n;
	}
	void display()
	{
		System.out.println("Three wheeler auto");
		super.display();
		System.out.println("No. of leaf:" +noofleaf);
	}
}

class Fourwheeler extends Vehicle
{
	int noofleaf;
	Fourwheeler(String r,int m,int n)
	{
		super(r,m);
		noofleaf=n;
	}
	void display()
	{
		System.out.println("Four wheeler car");
		super.display();
		System.out.println("No. of leaf:" +noofleaf);
	}
}
class Vehicle
{
	String regno;
	int model;
	Vehicle(String r, int m)
	{
		regno=r;
		model=m;
	}
	void display()
	{
		System.out.println("Registration no: "+regno);
		System.out.println("Model no: "+model);
	}




public static void main(String arg[])
{
	Vehicle v1=new Vehicle("Toyota", 123);
	Vehicle v2=new Vehicle("Hyundai", 123);
	
	if(v1.hashCode() == v2.hashCode())
    {
        if(v1.equals(v2))
            System.out.println("Both Objects are equal. ");
        else
            System.out.println("Both Objects are not equal. ");
     }
    else
    System.out.println("Both Objects are not equal. "); 
	
String s=new String("Honda");
System.out.println(s.hashCode());
s=s+"CVR";//consumes more space
System.out.println(s.hashCode());

ArrayList<String> list=new ArrayList<String>();
list.add("Honda");
list.add("BMW");
list.add("Audi");
list.add("Yamaha");

Collections.sort(list);
System.out.println("Ascending:"+list);
Collections.reverse(list);
System.out.println("Descending:"+list);

	/*{
		Twowheeler t1;
		Threewheeler th1;
		Fourwheeler f1;
		t1=new Twowheeler("TN74 12345", 1,2);
		th1=new Threewheeler("TN74 54321", 4,3);
		f1=new Fourwheeler("TN34 45677",5,4);
		t1.display();
		th1.display();
		f1.display();
	}*/

}}