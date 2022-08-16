package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		//Stream can be created with static data
		Stream<String>obj=Stream.of("Vinayak","Sapana","Janvi","Shubham");
		obj.forEach((i)->System.out.println(i));
		//stream can be accquired from array or collections
		List<String>obj1=Arrays.asList(new String[] {"Mumbai","nashik","nagpur","pune"});
		obj=obj1.stream();
		//obj.forEach((i)->System.out.println(i));
		obj.forEach(System.out::println);
		
	}

}
