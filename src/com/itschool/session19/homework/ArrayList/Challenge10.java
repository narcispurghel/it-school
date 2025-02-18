package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.Collections;

public class Challenge10 {
    /*
        Write a Java program to shuffle elements in an array list.
     */
    public static void main(String[] args) {
        System.out.println(PredefinedCollections.arrayList);
        Collections.shuffle(PredefinedCollections.arrayList);
        System.out.println(PredefinedCollections.arrayList);
    }
}
