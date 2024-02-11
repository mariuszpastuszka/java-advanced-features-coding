package com.sda.lambda;

public class LambdaExample {

    public static void main(String[] args) {
        Human human = new Human();
        Moveable human2 = new Human();
        Moveable bird = new Bird();
        human2.move();
        bird.move();

        // anonymous classes
        Moveable cat = new Moveable() {
            @Override
            public void move() {
                System.out.println("Cat is walking in anonymous way:)");
            }
        };
        cat.move();

        Moveable firstLambda = () -> System.out.println("First lambda");
        firstLambda.move();

        Flyable fly = () -> System.out.println("Fly is make me nervous:)");
        fly.fly();

        Flyable fly2 = () -> {};
        Flyable fly3 = () -> {
            System.out.println("Fly is flying");
        };
        Flyable fly4 = () -> {
            System.out.println("Fly");
            System.out.println("Fly");
            System.out.println("Fly");
        };

        // anonymous classes are useful still:)
        MovingWays movingWays = new MovingWays() {
            @Override
            public void slowMove() {

            }

            @Override
            public void fastMove() {

            }
        };
        MovingWays lambdaWay = () -> System.out.println("Slow move");
    }
}
