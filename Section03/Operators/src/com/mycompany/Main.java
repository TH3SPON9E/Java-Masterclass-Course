package com.mycompany;

public class Main {

    public static void main(String[] args) {
        // Operator is + and =
        // Operands are 1 and 2
	    int result = 1 + 2; // 1 + 2 = 3
	    System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous Result: " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result: " + previousResult);

        // Multiplication *
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // Division /
        result = result / 5; // 20 / 5;
        System.out.println("20 / 5 = " + result);

        // Modulus
        // Outputs the remainder of the operands
        result = result % 3; // Remainder of (4 % 3 = 1)
        System.out.println("4 % 3 = " + result);


        // Abbreviating Operators
        result = 10;
        // result = result + 1;
        result++; // Increments result by 1
        System.out.println("Result = 10 incremented by 1 = " + result);

        result = 10;
        // result = result -1;
        result--; // Decrements result by 1
        System.out.println("Result = 10 decremented by 1 = " + result);

        result = 10;
        // Result = result + 2;
        result += 5;
        System.out.println("Result = 10 incremented by 5 = " + result);

        result = 10;
        // Result = result - 2;
        result -= 5;
        System.out.println("Result = 10 decremented by 5 = " + result);

        result = 10;
        // Result = result * 2;
        result *= 2;
        System.out.println("Result = 10 multiplied by 2 = " + result);

        result = 10;
        // Result = result / 2;
        result /= 2;
        System.out.println("Result = 10 divided by 2 = " + result);
    }
}
