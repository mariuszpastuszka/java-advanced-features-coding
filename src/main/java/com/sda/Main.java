package com.sda;

import com.sda.model.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person me = new Person("Mariusz", "Pastuszka", 18);
        System.out.println("Hi, it's me: " + me);
    }
}