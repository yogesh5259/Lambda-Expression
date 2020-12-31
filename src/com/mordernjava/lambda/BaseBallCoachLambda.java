package com.mordernjava.lambda;

public class BaseBallCoachLambda {
    public static void main(String[] args) {
//        //Implement Coach using lambda
//        Coach theCoach = () -> {
//            return "Do batting practice for 30 minutes!!";
//        };

        //Braces are optional for one statement
        Coach theCoach = () -> "Do practice!!!";

        // using theCoach we can call the Coach method.
        System.out.println(theCoach.dailyExercise());
    }
}
