package com.calculator;

public class CalculatorController {
    private Calculator_I calculator;
    private Display_I display;
    
    public CalculatorController(Calculator_I calculator, Display_I display) {
        if (null == calculator) {
            throw new IllegalArgumentException("Calculator cannot be null");
        }
        if (null == display) {
            throw new IllegalArgumentException("Display cannot be null");
        }
        this.calculator = calculator;
        this.display = display;
    }
    
    public void add(int addend, int augend) {
        int result = calculator.add(addend, augend);
        display.display(result);
    }
}