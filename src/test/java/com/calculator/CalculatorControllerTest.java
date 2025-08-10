package com.calculator;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

public class CalculatorControllerTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);
    
    @Mock
    private Calculator_I mockCalculator;
    
    @Mock
    private Display_I mockDisplay;
    
    private CalculatorController calculatorController;
    
    @Before
    public void setUp() {
        calculatorController = new CalculatorController(mockCalculator, mockDisplay);
    }
    
    @Test
    public void GivenTwoInts_WhenAdd_ThenCallCalculatorAddAndDisplay() {
        given(mockCalculator.add(2, 3)).willReturn(5);
        
        calculatorController.add(2, 3);
        
        then(mockDisplay).should(times(1)).display(5);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void GivenNullCalculator_WhenConstruct_ThenThrowException() {
        new CalculatorController(null, mockDisplay);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void GivenNullDisplay_WhenConstruct_ThenThrowException() {
        new CalculatorController(mockCalculator, null);
    }
}