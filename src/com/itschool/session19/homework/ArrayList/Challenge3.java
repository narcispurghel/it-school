package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

public class Challenge3 {
    /*
        Write a Java program to insert an element into the array list at the first position.
     */
    public static void main(String[] args) {
        System.out.println(PredefinedCollections.arrayList);

        PredefinedCollections.arrayList.addFirst(0);

        System.out.println(PredefinedCollections.arrayList);
    }
}
