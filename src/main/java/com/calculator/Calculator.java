package com.calculator;

public class Calculator {
    
    public int add(int addend, int augend) {
        if (addend > 0 && augend > 0 && addend > Integer.MAX_VALUE - augend) {
            throw new ArithmeticException("Integer overflow");
        }
        if (addend < 0 && augend < 0 && addend < Integer.MIN_VALUE - augend) {
            throw new ArithmeticException("Integer underflow");
        }
        return addend + augend;
    }
}