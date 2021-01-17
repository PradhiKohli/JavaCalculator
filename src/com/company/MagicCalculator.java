package com.company;

import java.lang.Math;

public class MagicCalculator extends Calculator {

     public static double squareRoot(int num1) {
        return Math.sqrt(num1);
    }

    public static double sin(int num1) {
        return Math.sin(num1);
    }

    public static double cosine(int num1) {
        return Math.cos(num1);
    }

    public static double tangent(int num1) {
        return Math.tan(num1);
    }

    public static double power(int num1){
        return Math.pow(10, num1);
    }

    public static double reciprocal(int num1){
        return Math.pow(num1, -1);
    }

    public static int factorial(int num1) {
        int fact = 1;
        for (int i = 2; i <= num1; i++) {
            fact *= i;
        }
        return fact;
    }
}