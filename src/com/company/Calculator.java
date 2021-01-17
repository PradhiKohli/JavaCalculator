package com.company;

import java.util.*;

import static java.lang.Math.*;


public class Calculator {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int square(int num1) {
        return num1 * num1;
    }

    public static int percent(double num1, double num2){
        return(int)((num1/num2)*100);
    }
}
