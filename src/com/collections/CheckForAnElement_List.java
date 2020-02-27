package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CheckForAnElement_List {

	public static void main(String[] args) {
		List<String> empnames=new ArrayList<>();
		empnames.add("Krish");
		empnames.add("Ram");
		
		System.out.println(empnames.contains("Ram"));
		

	}

}
