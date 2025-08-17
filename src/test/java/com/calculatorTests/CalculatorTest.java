package com.calculatorTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculatorTest 
{
    @Test
    public void firstFailingTest() 
    {
        fail("This test should fail");
    }
    
}
