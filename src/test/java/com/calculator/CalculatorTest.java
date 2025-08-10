package com.calculator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest 
{
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void GivenTwoPosInts_WhenAdd_ThenProvideSum() 
    {
        assertThat(this.calculator.add(2,3), is(5));
    }
    
    @Test
    public void GivenTwoNegInts_WhenAdd_ThenProvideSum() 
    {
        assertThat(this.calculator.add(-2,-3), is(-5));
    }
    
    @Test
    public void GivenZeroAndInt_WhenAdd_ThenProvideSum() 
    {
        assertThat(this.calculator.add(5, 0), is(5));
    }
    
    @Test
    public void GivenPosAndNegInt_WhenAdd_ThenProvideSum() 
    {
        assertThat(this.calculator.add(5, -3), is(2));
    }
    
    @Test
    public void GivenMaxIntAndZero_WhenAdd_ThenProvideSum() 
    {
        assertThat(this.calculator.add(Integer.MAX_VALUE, 0), is(Integer.MAX_VALUE));
    }

    @Test (expected = ArithmeticException.class)
    public void GivenMaxIntAnd1_WhenAdd_ThenThrowException() 
    {
        this.calculator.add(Integer.MAX_VALUE, 1);
    }

    @Test (expected = ArithmeticException.class)
    public void Given1AndMaxInt_WhenAdd_ThenThrowException() 
    {
        this.calculator.add(1, Integer.MAX_VALUE);
    }
    
    @Test (expected = ArithmeticException.class)
    public void GivenMinIntAndNeg1_WhenAdd_ThenThrowException() 
    {
        this.calculator.add(Integer.MIN_VALUE, -1);
    }

    @Test
    public void GivenTwoPosInts_WhenDivide_ThenProvideQuotient() 
    {
        assertThat(this.calculator.divide(6, 2), is(3));
    }
    
    @Test
    public void GivenDividendAndZero_WhenDivide_ThenThrowException() 
    {
        try {
            this.calculator.divide(5, 0);
            org.junit.Assert.fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertThat(e.getMessage(), is("Cannot divide by zero"));
        }
    }
    
}
