package com.java;

public class main {

    public float addition(float num1, float num2) {
        return num1 + num2;
    }

    public float subtraction(float num1, float num2) {
        return num1 - num2;
    }

    public float multiplication(float num1, float num2) {
        return num1 * num2;
    }

    public float division(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("");
            return 0;
        }
        return num1 / num2;
    }
}