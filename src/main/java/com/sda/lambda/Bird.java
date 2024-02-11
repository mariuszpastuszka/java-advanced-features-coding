package com.sda.lambda;

public class Bird implements Moveable {
    @Override
    public void move() {
        System.out.println("Bird is flying...");
    }
}
