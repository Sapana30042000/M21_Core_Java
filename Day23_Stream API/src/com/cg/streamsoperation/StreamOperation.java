package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,40,56,32,78);
		//distinct:it takes unique values
		obj.stream().distinct().forEach(i->System.out.println(i+" "));
		System.out.println();

	}

}
