package com.calculator;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

public class CalculatorControllerTest {
    private Calculator calculator;
    private CalculatorController calculatorController;
    
    @Before
    public void setUp() {
        calculator = mock(Calculator.class);
        calculatorController = new CalculatorController(calculator);
    }
    
    @Test
    public void GivenTwoInts_WhenAdd_ThenCallCalculatorAdd() {
        calculatorController.add(2, 3);
        
        then(calculator).should().add(2, 3);
    }
}