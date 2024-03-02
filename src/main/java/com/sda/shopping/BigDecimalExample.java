package com.sda.shopping;

import java.math.BigDecimal;

public class BigDecimalExample {

    public static void main(String[] args) {
        // int/float working with primitives is just easy
        BigDecimal firstNumber =  BigDecimal.valueOf(100_000_000.45);
        BigDecimal secondNumber =  BigDecimal.valueOf(99_000_000.99);

        // firstNumber + secondNumber
        BigDecimal sum = firstNumber.add(secondNumber);
        System.out.println("Sum is: " + sum);

        // a * (b + c)/d
        firstNumber.multiply(firstNumber.add(secondNumber).divide(secondNumber));
    }
}
