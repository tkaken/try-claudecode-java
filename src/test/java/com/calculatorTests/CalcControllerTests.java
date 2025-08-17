package com.calculatorTests;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;


public class CalcControllerTests {

    @Rule public MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);

	@Test
	public void GivenTwoPositiveIntegers_WhenAdd_ThenGetSumFromCalcAndDisplayIt() 
    {
        fail("This test should fail");    
    }

}
