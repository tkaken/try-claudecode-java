package com.calculatorTests;

import static org.junit.Assert.fail;
import static org.mockito.BDDMockito.*;

import com.calculator.CalcController;
import com.calculator.Calculator_I;
import com.calculator.Display_I;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;


public class CalcControllerTests {

    @Rule public MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);

    @Mock
    private Calculator_I mockCalculator;
    
    @Mock
    private Display_I mockDisplay;

	@Test
	public void GivenTwoPositiveIntegers_WhenAdd_ThenGetSumFromCalcAndDisplayIt() 
    {
        // Expected values
        int expectedFirstNumber = 2;
        int expectedSecondNumber = 3;
        int expectedSum = 5;
        
        // Expectation
        given(mockCalculator.add(expectedFirstNumber, expectedSecondNumber)).willReturn(expectedSum);
        
        // Arrange
        var calcController = new CalcController(mockCalculator, mockDisplay);
        
        // Act
        calcController.add(expectedFirstNumber, expectedSecondNumber);

        // Assert
        then(mockDisplay).should().display(expectedSum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GivenNullCalculator_WhenConstructCalcController_ThenThrowIllegalArgumentException() {
        // Act
        new CalcController(null, mockDisplay);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GivenNullDisplay_WhenConstructCalcController_ThenThrowIllegalArgumentException() {
        // Act
        new CalcController(mockCalculator, null);
    }

}
