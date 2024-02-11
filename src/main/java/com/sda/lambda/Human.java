package com.sda.lambda;

public class Human implements Moveable {
    @Override
    public void move() {
        System.out.println("Human is walking");
    }
}
