package com.sda.stream;

import com.sda.model.Person;

import java.util.ArrayList;

public class StreamExample {

    public static void main(String[] args) {
        System.out.println("Let's play with streams");

        var persons = new ArrayList<Person>();
        persons.add(new Person("Erik", "Cantona", 8));
        persons.add(
                new Person("John", "Doe", 21)
        );
        persons.add(new Person("Mikolaj", "Kopernik", 55));

        // filter out kids
        var onlyAdults = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .toList();
        System.out.println("Adults: " + onlyAdults);
        System.out.println("Persons: " + persons);

        System.out.println();
        System.out.println("Play with kids filtering");
        var kids = persons.stream()
                .filter(person -> {
                    System.out.println("Filtering person: " + person);
                    return person.getAge() < 18;
                })
                .filter(person -> {
                    System.out.println("Leaving just kids with name started with B letter");
                    return person.getName().startsWith("B");
                })
                .toList();

        System.out.println();
        // get names of only adults
        var justNames = persons.stream()
                .filter(person -> {
                    System.out.println("Checking if person is adult..." + person);
                    return person.getAge() >= 18;
                })
                .map(person -> {
                    person.setAge(person.getAge() + 1);
                    return person;
                })
                .map(person -> {
                    System.out.println("Mapping person to name: " + person);
                    return person.getName();
                })
                .toList();

        System.out.println("Just names: " + justNames);


    }
}
