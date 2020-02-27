package com.collections;

import java.util.ArrayList;
import java.util.List;

public class FilterList {

	public static void main(String[] args) {
		List<Integer> allelements=new ArrayList<>();
		allelements.add(1);
		allelements.add(2);
		allelements.add(3);
		allelements.add(3);
		allelements.add(3);
		allelements.add(2);
		
		allelements.stream().filter(x->x==3).forEach(System.out::println);
		
		

	}

}
