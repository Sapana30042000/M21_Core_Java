package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[] {-1,52,56,54,65,42});
		Collection<Integer> intList;
		Optional<Integer>obj2=intList.stream().filter((i)->i>5);

	}

}
