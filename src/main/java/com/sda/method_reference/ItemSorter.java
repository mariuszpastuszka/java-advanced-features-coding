package com.sda.method_reference;

import com.sda.shopping.Item;

public class ItemSorter {

    // int compare(T o1, T o2);
    static int orderItems(Item first, Item second) {
        return (int) (second.priceInEuros() - first.priceInEuros());
    }
}
