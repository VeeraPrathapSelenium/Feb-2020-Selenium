package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetsImplementation {
	public static void main(String[] args) {
		
		Set myset=new TreeSet();
		myset.add("Hello");
		
		myset.add("India");
		
		myset.add("America");
		myset.add("India");
		myset.add("India");
		myset.add("India");
		myset.add("India");
		System.out.println(myset.size());
		
		Set secondSet=new HashSet<>();
		secondSet.add("Japan");
		secondSet.add("China");
		secondSet.add("Koria");
		
		myset.addAll(secondSet);
		
	
		
//	for (Object element : myset) {
//		System.out.println(element);
//	}
		
		Iterator itr=myset.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println("****************************");
		
		myset.removeAll(secondSet);
		
 itr=myset.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
