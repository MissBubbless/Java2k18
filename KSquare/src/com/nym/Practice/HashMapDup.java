package com.nym.Practice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class HashMapDup {
	public static void main(String args[])
	{
		String n="Nymisha Reddy";
		char[] c=n.toCharArray();
		HashMap<Character,Integer> h=new HashMap<Character, Integer>();		
		for(Character ch:c) {
			if(h.containsKey(ch))
			{
				h.put(ch, h.get(ch)+1);
			}
			else
			{
				h.put(ch,1);
			}
		}
			Set<Character> s=h.keySet();
			for(Character ch1:s) {
				
				System.out.print(ch1.toString()+h.get(ch1)+" ");
			}
		}	
	
	}