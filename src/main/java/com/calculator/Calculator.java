package com.calculator;

public class Calculator implements Calculator_I {
    
    public int add(int augend, int addend) {
        return Math.addExact(augend, addend);
    }
}