package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge19 {
    /*
        Write a Java program to trim the capacity of an array list the current list size.
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        arrayList.add(1);

        arrayList.trimToSize();
    }
}
