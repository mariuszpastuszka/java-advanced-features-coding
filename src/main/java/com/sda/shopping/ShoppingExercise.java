package com.sda.shopping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class ShoppingExercise {

    public static void main(String[] args) {
        ShoppingList firstShopping = new ShoppingList(LocalDate.of(2024, Month.JANUARY, 25),
                "Internet",
                List.of(
                        new Item("iPhone X", 1000.45),
                        new Item("drinks", 505.99)
                ));

        var firstShoppingTotalPrice = firstShopping.items()
                .stream()
                .mapToDouble(Item::priceInEuros)
                .sum();

        System.out.println("Total price of first shopping: " + firstShoppingTotalPrice);
        ShoppingList secondShopping = new ShoppingList(LocalDate.of(2024, Month.FEBRUARY, 20),
                "Internet",
                List.of(
                        new Item("Galaxy X", 999.99),
                        new Item("pizza", 444.99)
                ));

        var secondShoppingTotalPrice = secondShopping.items()
                .stream()
                .mapToDouble(item -> item.priceInEuros())
                .sum();

        var totalShoppingPrice = firstShoppingTotalPrice + secondShoppingTotalPrice;
        System.out.println("Total price of all shoppings: " + totalShoppingPrice);

        // find total price for all items
        // use flatMap to deal with Matryoshka
        var myShoppings = List.of(firstShopping, secondShopping);
        var totalTotalPrice = myShoppings.stream()
                .map(shoppingList -> shoppingList.items())
                .flatMap(items -> items.stream())
                .mapToDouble(item -> item.priceInEuros())
                .sum();
        System.out.println("Total total price is: " + totalTotalPrice);
    }
}
