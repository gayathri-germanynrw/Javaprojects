package com.gayu.hibernateprojects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {


	public static void main(String[] args) {
		List<LaptopComparator> lap=new ArrayList<>();
		lap.add(new LaptopComparator("Mac",16,5000));
		lap.add(new LaptopComparator("Dell",8,700));
		lap.add(new LaptopComparator("Acer",10,600));
		
		Comparator<LaptopComparator> com=new Comparator<LaptopComparator>() {
			
			public int compare(LaptopComparator l1,LaptopComparator l2) {
				
				if(l1.getPrice()>l2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(lap,com);
		
		for(LaptopComparator l:lap) {
			System.out.println(l);
		}
	}


}
