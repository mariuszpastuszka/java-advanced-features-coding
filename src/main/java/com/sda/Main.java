package com.sda;

import com.sda.model.ImmutablePerson;
import com.sda.model.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person me = new Person("Mariusz", "Pastuszka", 18);
        System.out.println("Hi, it's me: " + me);

        me.setName("Maniek");
        System.out.println("With changed name: " + me);

        ImmutablePerson meAgain = new ImmutablePerson("Mariusz", "Pastuszka", 21);
        System.out.println("Me again: " + meAgain);

        ImmutablePerson fixedMe = new ImmutablePerson(meAgain.getName(), meAgain.getSurname(), 42);
        System.out.println("Fixed me: " + fixedMe);
    }
}