package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;

public class Challenge13 {
    /*
        Write a Java program to compare two array lists.
     */
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(PredefinedCollections.arrayList);

        System.out.println(array.equals(PredefinedCollections.arrayList)); // True compare elements and size
        System.out.println(array == PredefinedCollections.arrayList); // False compare instances
    }
}
