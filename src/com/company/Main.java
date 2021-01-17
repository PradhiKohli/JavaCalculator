package com.company;

import com.company.Calculator;
import com.company.MagicCalculator;

public class Main {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;

        System.out.println("Welcome to the Calculator Plus\n" + "{Num1 = 4 , Num2 = 2} \n");
        // calc class
        System.out.println("Adding num1 and num2");
        System.out.println(Calculator.add(num1, num2));
        System.out.println("\n");

        System.out.println("Subtracting num2 from num1");
        System.out.println(Calculator.subtract(num1, num2));
        System.out.println("\n");

        System.out.println("Multiplying num1 and num2");
        System.out.println(Calculator.multiply(num1, num2));
        System.out.println("\n");

        System.out.println("Dividing num1 and num2");
        System.out.println(Calculator.divide(num1, num2));
        System.out.println("\n");

        System.out.println("Squaring num1");
        System.out.println(Calculator.square(num1));
        System.out.println("\n");

        System.out.println("Percentage of num1/num2");
        System.out.println(Calculator.percent(num1, num2) + "%");
        System.out.println("\n");

        // Magic Calc Class
        System.out.println("Square Root");
        System.out.println(MagicCalculator.squareRoot(num1));
        System.out.println("\n");

        System.out.println("Sin");
        System.out.println(MagicCalculator.sin(num1));
        System.out.println("\n");

        System.out.println("Cosine");
        System.out.println(MagicCalculator.cosine(num1));
        System.out.println("\n");

        System.out.println("Tangent");
        System.out.println(MagicCalculator.tangent(num1));
        System.out.println("\n");

        System.out.println("Factorial");
        System.out.println(MagicCalculator.factorial(num1));
        System.out.println("\n");

        System.out.println("Exponent 10^num1");
        System.out.println(MagicCalculator.power(num1));
        System.out.println("\n");

        System.out.println("Reciprocal or Inverse of num1");
        System.out.println(MagicCalculator.reciprocal(num1));
        System.out.println("\n");


//        System.out.println("please enter number");
    }
}
