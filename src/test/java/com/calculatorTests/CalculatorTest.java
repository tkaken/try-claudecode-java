package com.calculatorTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import com.calculator.Calculator;
import com.calculator.Calculator_I;

public class CalculatorTest 
{
    private Calculator_I calculator;
    
    @Before
    public void setUp() 
    {
        calculator = new Calculator();
    }
    
    @Test
    public void GivenTwoPosNumbers_WhenAddIsCalled_ThenSumIsReturned() 
    {
        // Act
        assertThat(this.calculator.add(2, 3), is(5));
    }
    
    @Test
    public void GivenTwoNegNumbers_WhenAddIsCalled_ThenSumIsReturned() 
    {
        // Act
        assertThat(this.calculator.add(-2, -3), is(-5));
    }
    
    @Test(expected = ArithmeticException.class)
    public void GivenNumbersTooBigForInt_WhenAddIsCalled_ThenThrowsArithmeticException() 
    {
        // Act
        this.calculator.add(Integer.MAX_VALUE, 1);
    }
    
}
