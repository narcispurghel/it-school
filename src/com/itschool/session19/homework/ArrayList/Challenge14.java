package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.Collections;

public class Challenge14 {
    /*
        Write a Java program of swap two elements in an array list.
     */
    public static void main(String[] args) {
        System.out.println(PredefinedCollections.arrayList);
        Collections.swap(PredefinedCollections.arrayList, 1, 2);
        System.out.println(PredefinedCollections.arrayList);
    }
}
