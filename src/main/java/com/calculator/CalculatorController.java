package com.calculator;

public class CalculatorController {
    private Calculator_I calculator;
    private Display_I display;
    
    public CalculatorController(Calculator_I calculator, Display_I display) {
        this.calculator = calculator;
        this.display = display;
    }
    
    public void add(int addend, int augend) {
        int result = calculator.add(addend, augend);
        display.display(result);
    }
}