package com.calculator;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

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
    private Calculator_I calculator;
    
    @Mock
    private Display_I display;
    
    private CalculatorController calculatorController;
    
    @Before
    public void setUp() {
        calculatorController = new CalculatorController(calculator, display);
    }
    
    @Test
    public void GivenTwoInts_WhenAdd_ThenCallCalculatorAddAndDisplay() {
        given(calculator.add(2, 3)).willReturn(5);
        
        calculatorController.add(2, 3);
        
        then(display).should().display(5);
    }
}