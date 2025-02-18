package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge16 {
    /*
        Write a Java program to clone an array list to another array list.
     */
    public static void main(String[] args) {
        System.out.println(PredefinedCollections.arrayList);
        ArrayList<Integer> clone = PredefinedCollections.arrayList;
        System.out.println(clone);
        clone.add(1); // Also adds to PredefinedCollections.arrayList because clone was initiated as a reference
        System.out.println(clone);
        System.out.println(PredefinedCollections.arrayList);
        System.out.println(PredefinedCollections.arrayList == clone); // True same reference
    }
}
