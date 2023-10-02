package com.example.calculator;

public class Calculator {
    private float a;
    private float b;

    public Calculator(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public static float calculate(float a, float b, char cal) {
        switch (cal) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                }
                else {
                    throw new RuntimeException("Cant divide by zero");
                }
            default: throw new RuntimeException("Invalid operation");
        }
    }
}
