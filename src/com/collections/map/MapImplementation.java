package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> empdetails=new HashMap<>();
		
		empdetails.put(1, "Prathap");
		empdetails.put(2, "Naresh");
		empdetails.put(3, "Hari");
		empdetails.put(1, "Ram");
		
//		System.out.println(empdetails.size());
//		
//		System.out.println(empdetails.get(1));
//		
//		for (Integer key : empdetails.keySet()) {
//			
//			System.out.println("Key :"+key+" Value is :"+empdetails.get(key));
//			
//			
//		}
//		
		
//		for (String value : empdetails.values()) {
//			System.out.println(value);
//		}
//		
//		for(Map.Entry<Integer,String> employee:empdetails.entrySet()) {
//			
//			System.out.println(employee.getKey());
//			System.out.println(employee.getValue());
//		}
//		
		
	Iterator itr=empdetails.entrySet().iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
		
		

	}

}
