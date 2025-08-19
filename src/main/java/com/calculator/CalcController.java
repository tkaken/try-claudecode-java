package com.calculator;

public class CalcController {
    private final Calculator_I calculator;
    private final Display_I display;
    
    public CalcController(Calculator_I calculator, Display_I display) {
        if (null == calculator) {
            throw new IllegalArgumentException();
        }
        if (null == display) {
            throw new IllegalArgumentException();
        }
        this.calculator = calculator;
        this.display = display;
    }
    
    public void add(int augend, int addend) {
        int sum = calculator.add(augend, addend);
        display.display(sum);
    }
}