package com.sda.method_reference;

import com.sda.shopping.Item;
import com.sda.shopping.ShoppingList;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {
        ShoppingList firstShopping = new ShoppingList(LocalDate.now(), "Tartu Kaubamaja", List.of(
                new Item("Piim", 0.56),
                new Item("Avokaado", 2.99),
                new Item("Sepik", 1.49),
                new Item("Kodujuust", 1.79)
        ));

        List<String> itemsNames = firstShopping.items()
                .stream()
                .map(item -> {
                    return item.name();
                })
                .toList();

        List<String> itemsNames2 = firstShopping.items()
                .stream()
//                .map(item -> item.name())
                .map(Item::name)
                .toList();

        var prices = firstShopping.items()
                .stream()
//                .map(item -> item.priceInEuros())
                .map(Item::priceInEuros)
                .toList();

        firstShopping.items()
                .forEach(item -> System.out.println(item));

        firstShopping.items()
                .forEach(System.out::println);

        firstShopping.items()
                .forEach(item -> System.out.println("Item: " + item));


        System.out.println("Now, let's do some sorting");
        List<Item> items = new ArrayList<>();
        items.add(new Item("Piim", 0.56));
        items.add(new Item("Avokaado", 2.99));
        items.add(new Item("Sepik", 1.49));
        items.add(new Item("Kodujuust", 1.79));

//        items.sort((o1, o2) -> o1.name().compareTo(o2.name()));
        items.sort(Comparator.comparing(item -> item.name()));
        items.sort(Comparator.comparing(Item::name));
        System.out.println("Items sorted by name: " + items);

//        items.sort();
        //(o1, o2) -> Double.valueOf(o1.priceInEuros()).compareTo(Double.valueOf(o2.priceInEuros()))
        //Comparator.comparing(o -> Double.valueOf(o.priceInEuros()))
        //Comparator.comparing(o -> o.priceInEuros())
        items.sort(Comparator.comparing(Item::priceInEuros));
        System.out.println("Items sorted by price: " + items);

        items.sort((o1, o2) -> ItemSorter.orderItems(o1, o2));
        items.sort(ItemSorter::orderItems);
    }
}
