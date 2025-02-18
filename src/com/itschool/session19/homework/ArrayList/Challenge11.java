package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.Collections;

public class Challenge11 {
    /*
        Write a Java program to reverse elements in an array list.
     */
    public static void main(String[] args) {
        System.out.println(PredefinedCollections.arrayList);
        Collections.reverse(PredefinedCollections.arrayList);
        System.out.println(PredefinedCollections.arrayList);
    }
}
