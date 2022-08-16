package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[] {"Apple","Banana","Mango","lichi"});
		System.out.println("Word lenth for object- fruit");
		obj.stream().map(String::length).forEach(i->System.out.println(i+" "));
		List<Integer>obj1=Arrays.asList(new Integer[] {12,56,54,65,42});
		obj1.stream().map(i->i*i).collect(Collectors.toList());	
		System.out.print(obj1+" ");

	}

}
