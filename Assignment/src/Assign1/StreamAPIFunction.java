package Assign1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPIFunction {
	public static void main(String[] args) {

		List<Integer> list=new ArrayList<Integer>();
		list.add(20); 
		list.add(23);
		//stream method with filter configured
		list.stream().filter(i -> i%2==0).forEach(i ->System.out.println(i));

		// stream method with map configured
		list.stream().map(i->i*i).forEach(i ->System.out.println("square value of all--"+i));

		//SAM -Single Abstract Method ( Functional Interface )

     	List<Integer> values=Arrays.asList(1,3,4,5,6);

		Consumer<Integer> consumeIF=new Consumer<Integer>() {

			public void accept(Integer i) {
				System.out.println(i);

			}
		};
		// forEach accepts ConsumerInterface
		values.forEach(consumeIF);

		values.forEach((i)-> System.out.println(i)); // Lambda Expression

		values.forEach(System.out::println); // Method Reference

		

	}

}
