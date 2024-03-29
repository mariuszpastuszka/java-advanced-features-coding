package com.sda.hashcode_and_equals;

import com.sda.model.Dog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashCodeEqualsDogExample {

    public static void main(String[] args) {
        Dog azor = new Dog("Azor", 1);
        System.out.println("My dog: " + azor);

        Dog anotherAzor = new Dog("Azor", 1);
        System.out.println("Another azor: " + anotherAzor);

        Dog azor2 = azor;
        // == - checks if references shows the same object
        System.out.println("Is azor2 == azor: " + (azor2 == azor));

        System.out.println("Is anotherAzor == azor: " + (anotherAzor == azor));
        azor2.setAge(2);
        System.out.println("Azor: " + azor);
        azor.setAge(1);

        System.out.println("Let's check equals");
        // azor == anotherAzor - default behaviour of equals()
        System.out.println("azor.equals(anotherAzor): " + azor.equals(anotherAzor));

        System.out.println("The same azor: " + azor.equals(azor));
        System.out.println("Comparing azor with String: " + azor.equals("haha"));

        List<Dog> dogList = new ArrayList<>();
        dogList.add(azor);
        dogList.add(anotherAzor);
        System.out.println("dog list size: " + dogList.size());
        System.out.println("dogList.contains(azor): " + dogList.contains(azor));

        System.out.println("azor hashcode: " + azor.hashCode());
        System.out.println("another azor hashcode: " + anotherAzor.hashCode());
        Set<Dog> dogSet = new HashSet<>();
        dogSet.add(azor);
        dogSet.add(anotherAzor);
        System.out.println("Size of dogSet is: " + dogSet.size());

        // only hashing collections need hashCode() method
        // Sets and Maps
        // Sets: HashSet, TreeSet, LinkedHashSet
        // Map: HashMap, TreeMap, LinkedHashMap
        // hashCode value is used as id of internal bucket (like a queue)
        // only if You're in right bucket equals is used
        // hashcode - equals contract
        // equals - true -> hashCode need to be the same

    }
}
