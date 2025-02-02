package com.LAmbda;

public class BikeImpl {
    public static void main (String args[]) {
        Bike bike1 = () -> "fzx";
        Bike bike2 = () -> "bullet";
        System.out.println(bike1.getName());
        System.out.println(bike2.getName());
    }
}
     