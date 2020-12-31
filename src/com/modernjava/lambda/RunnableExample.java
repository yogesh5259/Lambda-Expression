package com.modernjava.lambda;

@SuppressWarnings("All")
public class RunnableExample {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable interface...");
            }
        };
        new Thread(runnable).start();

        //Implement Runnable using lambda
        Runnable runnable1 = () -> {
            System.out.println("Inside lambda Runnable..");
        };
        new Thread(runnable1).start();

        //Implement thread using lambda
        new Thread( () -> {
            System.out.println("Inside thread using lambda!");
        }).start();
    }
}
