package com.calculator;

public class Calculator implements Calculator_I {
    
    public int add(int addend, int augend) {
        if (addend > 0 && augend > 0 && addend > Integer.MAX_VALUE - augend) {
            throw new ArithmeticException("Integer overflow");
        }
        if (addend < 0 && augend < 0 && addend < Integer.MIN_VALUE - augend) {
            throw new ArithmeticException("Integer underflow");
        }
        return addend + augend;
    }
    
    public int divide(int dividend, int divisor) {
        if (0 == divisor) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
}