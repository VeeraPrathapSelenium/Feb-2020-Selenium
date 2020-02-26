package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList {
public static void main(String[] args) {
	List<String> empdetails=new ArrayList<String>();
	
	empdetails.add("Prathap");
	empdetails.add("Rahul");
	empdetails.add("Krish");
	empdetails.add("Raja");
	empdetails.add("Prathap");
	
	//System.out.println(empdetails.get(0));
	
//	for(int i=0;i<empdetails.size();i++)
//	{
//		System.out.println(empdetails.get(i));
//	}
//	
	
//	for (String empname : empdetails) {
//		System.out.println(empname);
//	}
	
	
//	Iterator itr=empdetails.listIterator();
//	
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	System.out.println("Length of a list before deletion "+empdetails.size());
	//empdetails.remove(0);
	empdetails.clear();
	
	System.out.println("Length of a after deletion "+empdetails.size());
	
}
}
