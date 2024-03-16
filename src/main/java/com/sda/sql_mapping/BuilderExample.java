package com.sda.sql_mapping;

public class BuilderExample {

    public static void main(String[] args) {
        AddressEntity myAddress = new AddressEntity(null,
                "Warsaw",
                "Syta",
                10L,
                "02-999");

        AddressEntity builtWithBuilder = AddressEntity.builder()
                .id(null)
                .city("Warsaw")
                .street("Syta")
                .flatNumber(10L)
                .zipCode("02-777")
                .build();
    }
}
