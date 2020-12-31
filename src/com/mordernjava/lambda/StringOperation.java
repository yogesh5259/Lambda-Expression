package com.mordernjava.lambda;

public class StringOperation {

    public static void main(String[] args) {
        //Implement Concate interface using lambda
        Concate theConcate = (String first, String second)-> first + " " + second;

        System.out.println(theConcate.concate("HELLO", "WORLD!"));
    }
}
