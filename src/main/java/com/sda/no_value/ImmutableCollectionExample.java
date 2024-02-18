package com.sda.no_value;

public class ImmutableCollectionExample {

    public static void main(String[] args) {
        System.out.println("Immutable collection example");
        String name = "Mariusz";
        String someSubstring = name.substring(4);

        System.out.println("name = " + name);
        System.out.println("someSubstring = " + someSubstring);

        name = name.substring(4);
    }
}
