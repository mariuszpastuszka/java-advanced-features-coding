package com.sda.model;

public record PersonRecord(
        // components
        String name,
        String surname,
        int age
) {
    public static final int AVARAGE_AGE = 80;

    @Override
    public String name() {
        System.out.println("Reading name");
        return name;
    }

    public String nameWithSurname() {
        return name + " " + surname;
    }
}
