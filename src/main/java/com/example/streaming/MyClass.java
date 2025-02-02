package com.example.streaming;

public class MyClass {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1 ; i <= 10 ; i++ ) {
                System.out.println("HELLO -> " +i);
            }
        };
            Thread childThread = new Thread(runnable);
            childThread.run();
    }
}
