package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollections {

	public static void main(String[] args) {
		List<Integer> salary=new ArrayList<>();
		salary.add(100);
		salary.add(1800);
		salary.add(1000);
		salary.add(25);
		salary.add(25000);
		
		Collections.sort(salary);
		
		for (Integer sal : salary) {
			System.out.println(sal);
		}
		
		System.out.println(Collections.max(salary));
		

	}

}
