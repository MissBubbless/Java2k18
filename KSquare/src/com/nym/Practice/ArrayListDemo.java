package com.nym.Practice;
import java.util.*;
import java.util.jar.Attributes.Name;
public class ArrayListDemo {
String name,temp;
	public static void main(String args[])
	{
ArrayList<String> list=new ArrayList<String>();
list.add("Zero");
list.add("One");
list.add(1,"Yes");

for(int i=0;i<list.size();i++) {
	for(int j=i+1;j<list.size();j++) {
		if(list.get(i).compareTo(list.get(j))>0)
		{
			String temp=list.get(i);
		list.add(i,list.get(j));
			list.add(j,temp);
			
		}
		System.out.println("hello");

		}

	}

for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));
}
		
	
}
}
	