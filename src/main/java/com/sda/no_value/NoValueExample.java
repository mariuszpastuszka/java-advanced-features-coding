package com.sda.no_value;

import com.sda.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class NoValueExample {

    public static void main(String[] args) {
        System.out.println("Handling no values");
//        String name = 1;
        List<Person> somePersons = somePersons();
        somePersons.add(new Person("M", "P", 40));

        for (Person p : somePersons()) {
            System.out.println("Person: " + p);
        }

        Person person = personWithNick(new Person("M", "P.", 18));
        if (person != null) {
            person.setAge(5);
        }

        Optional<Person> maybePerson = containerWithPerson(new Person("M", "P.", 18));
        maybePerson.ifPresent(person1 -> {
            System.out.println("Great");
            System.out.println("Person: " + person1);
        });
        Optional<Person> maybePerson2 = emptyContainerWithoutPerson(new Person("M", "P.", 18));
        maybePerson2.ifPresent(person1 -> {
            System.out.println("Great");
            System.out.println("Person: " + person1);
        });
    }

    public static List<Person> somePersons() {
//        return null;
//        return Collections.emptyList();
        return new ArrayList<>();
    }

//    public static Person? personWithNick(Person person) {
    public static Person personWithNick(Person person) {
        // person doesn't have some nick...
        return null;
    }

    public static Optional<Person> containerWithPerson(Person person) {
        return Optional.of(person);
    }

    public static Optional<Person> emptyContainerWithoutPerson(Person person) {
        return Optional.ofNullable(null);
    }
}
