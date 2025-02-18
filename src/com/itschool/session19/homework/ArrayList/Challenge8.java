package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.Collections;

public class Challenge8 {
    /*
        Write a Java program to sort a given array list.
     */
    public static void main(String[] args) {
        System.out.println( "Initial: " + PredefinedCollections.arrayList);
        Collections.sort(PredefinedCollections.arrayList);
        System.out.println("Sorted: " + PredefinedCollections.arrayList);
    }
}
