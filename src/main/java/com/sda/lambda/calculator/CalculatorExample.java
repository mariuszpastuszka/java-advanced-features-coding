package com.sda.lambda.calculator;

public class CalculatorExample {

    public static void main(String[] args) {
        System.out.println("Let's create calculator and use lambdas");
        AddOperation addOperation1 = (firstArgument, secondArgument) -> firstArgument + secondArgument;
        int result = addOperation1.add(1, 3);
        System.out.println("result is: " + result);

        AddOperation addOperation2 = (first, second) -> {
            System.out.println("Received first: " + first);
            System.out.println("Received second: " + second);

            int sum = first + second;
            System.out.println("Sum is: " + sum);
            return sum;
        };
        addOperation2.add(4, 3);

        SubOperation subOperation = (first, second) -> first - second;

        int result2 = subOperation.sub(10, 2);
        System.out.println("Result is: " + result2);

        System.out.println("Calculator operations");
        CalculatorOperations calculatorOperations = (a, b) -> {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                return 0;
            }

        };

        calculatorOperations.div(4, 2);
        int result3 = calculatorOperations.div(4, 0);
        System.out.println("result3 is: " + result3);

        CalculatorOperations calculatorOperations1 = (a, b) -> {
            if (b == 0) {
                System.out.println("Wrong argument provided!!!");
                throw new WrongArgumentException("Cannot devide by 0!!!");
            }
            return a / b;
        };
        try {
            calculatorOperations1.div(5,0);
        } catch (WrongArgumentException e) {
            System.out.println("My fault :)");
        }


    }
}
