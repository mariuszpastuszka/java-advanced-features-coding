package com.sda.homework.exercise1;

public record Address(
        String city,
        String street,
        String country,
        String postCode
) implements Comparable<Address> {
    @Override
    public int compareTo(Address o) {
//        if (city.compareTo(o.city) < 0) {
//            return -1;
//        } else if (city.compareTo(o.city) > 0) {
//            return 1;
//        } else {
//            return 0;
//        }
        return city.compareTo(o.city);
    }
}
