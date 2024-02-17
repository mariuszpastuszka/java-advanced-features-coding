package com.sda.variables;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class VarExample {

    List<String> strings;
    public static void main(String[] args) {
        // till Java 7
        List<String> stringList1 = new ArrayList<String>();

        List<String> stringList = new ArrayList<>();

        ArrayList<String> strings1 = new ArrayList<>();
        var strings = new ArrayList<String>();
        var setOfString = new HashSet<String>();
        var i = 1;
        int j = 1;
    }
}
