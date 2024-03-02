package com.sda.map_exercises;

import com.sda.model.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExercise {

    public static void main(String[] args) {
        // unordered - but fast
        Map<String, Integer> namesOverAges = new HashMap<>();
        namesOverAges.put("mariusz", 40);

        // ordered
        Map<String, Integer> namesOverAges2 = new LinkedHashMap<>();

        // sorted based on keys - natural order (comparable), can be changed by comparator
        Map<String, Integer> namesOverAges3 = new TreeMap<>();
        Map<Person, Integer> personsOverAge = new TreeMap<>((o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));
        var person = new Person("m", "p", 40);
        personsOverAge.put(person, 40);

        Map<String, Integer> namesOverAges4 = Map.of(
                "mariusz", 1,
                "john", 18
        );
        // maps created with "of" are immutable
//        namesOverAges4.put("erik", 15);

        // map iteration - old way
        for (String key : namesOverAges4.keySet()) {
            System.out.println("Key is: %s, value is: %d".formatted(key, namesOverAges4.get(key)));
        }

        // map iteration - new way
        // %s - replace by string value
        // %d - replace by number value
        namesOverAges4.forEach((key, value) -> System.out.println("Key is: %s, value is: %d".formatted(key, value)));
        namesOverAges4.forEach((key, value) -> System.out.println("Key is: " + key + ", value is: " + value));
    }
}
