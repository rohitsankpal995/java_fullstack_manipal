package com.ani;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {3, 4, 5, 6, 7};

        List<Integer> list1 = Arrays.asList(array1);
        List<Integer> list2 = Arrays.asList(array2);

        // Find common elements using lambda function
        List<Integer> common = list1.stream()
                .filter(list2::contains)
                .toList();

        // Find unique elements using lambda function
        List<Integer> unique = new ArrayList<>(list1);
        unique.addAll(list2);
        unique.removeIf(common::contains);

        System.out.println("Common elements: " + common);
        System.out.println("Unique elements: " + unique);
    }
}

