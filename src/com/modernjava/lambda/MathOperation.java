package com.modernjava.lambda;

@SuppressWarnings("All")
public class MathOperation {
    public static void main(String[] args) {
        // Use lambda expression for add
        Sum thesum = (firstNumber,secondNumber) -> firstNumber + secondNumber;

        System.out.println(thesum.sum(30,40));
    }
}
