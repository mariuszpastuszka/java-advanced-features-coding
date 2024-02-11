package com.sda.lambda;

@FunctionalInterface
public interface MovingWays {
    abstract void slowMove();
    default void averageMove() {
        System.out.println("average move");
    }
    default void fastMove() {
        System.out.println("fast move");
    }
}
