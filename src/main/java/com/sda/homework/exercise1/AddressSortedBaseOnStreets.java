package com.sda.homework.exercise1;

import java.util.Comparator;

public class AddressSortedBaseOnStreets implements Comparator<Address> {

    @Override
    public int compare(Address o1, Address o2) {
        return o1.street().compareTo(o2.street());
    }
}
