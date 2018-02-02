package com.nym.Practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("nymisha");//abc is taken//string is immutable	= the obj change maadidre new obj creates on the 	
		System.out.println(s.hashCode());
		s=s+"Reddy";//consumes more space
		System.out.println(s.hashCode());
				
		StringBuffer sb=new StringBuffer("Nymisha");
		System.out.println(sb.hashCode());
		sb.append("Reddy");
		System.out.println(sb.hashCode());
	}

}
