package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class FourthUnitTestingProgram 
{
	@Test
	void display()
	{
		int arr[]={1,2,3,4,5};
		//asserEquals method will check whether the two parameters value are same or not
		//if it is same then you will not get any failure otherwise you will get failures
		assertAll("arr",()->assertEquals(arr[3],4),
				()->assertEquals(arr[2],4));//arr[3]=4//true //it runs successfully
		
	}

}
