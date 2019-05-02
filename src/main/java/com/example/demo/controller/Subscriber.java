package com.example.demo.controller;

public class Subscriber {

    public static void multipilicar(Integer n) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Subscriber 2:" + n * n);
    }
}
