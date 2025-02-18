package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;

public class Challenge20 {
    /*
         Write a Java program to increase the size of an array list.
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(1);
        arrayList.add(1);

        arrayList.ensureCapacity(2);
        arrayList.add(2);
    }
}
