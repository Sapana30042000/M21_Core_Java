package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FifthUnitTestingProgram 
{
	@Test
	@Disabled
	void trueAssumption()
	{
		//assumetrue says that if your assumption and result both are true then it will execute else not
		assumeTrue(5>1);
		assertEquals(5+2,7);
	}
    @Test
    @Disabled
    void falseAssumption()
    {
    	//will evaluate the given assumption and test will run if result is false
    	assumeFalse(5<1);
    	//assertEquals(5+2,7);
    }
    @Test
    void assumptionThat()
    {
    	//it will evalute the lambda executable only if given assumption is true
    	String str="Shiwani";
    	assumingThat(str.equals("ashi"),
    			()->assertEquals(2+3,5));
    }
}
