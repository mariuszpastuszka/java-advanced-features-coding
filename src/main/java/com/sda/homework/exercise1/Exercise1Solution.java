package com.sda.homework.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1Solution {

    public static void main(String[] args) {
        var addresses = new ArrayList<Address>();
        addresses.add(new Address("Warsaw", "Marszałkowska", "Poland", "02-872"));
        addresses.add(new Address("Poznań", "Poznańska", "Poland", "05-872"));
        addresses.add(new Address("Kraków", "Rynek Główny", "Poland", "05-123"));
        addresses.add(new Address("Rzeszów", "Rejtana", "Poland", "17-123"));
        addresses.add(new Address("Kielce", "Warszawska", "Poland", "17-123"));

        addresses.sort((o1, o2) -> o1.street().compareTo(o2.street()));

        System.out.println(addresses);
    }
}
