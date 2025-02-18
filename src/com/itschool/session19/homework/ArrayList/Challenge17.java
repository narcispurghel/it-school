package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.Iterator;

public class Challenge17 {
    /*
        Write a Java program to empty an array list.
     */
    public static void main(String[] args) {
        Iterator<Integer> iterator = PredefinedCollections.arrayList.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println(PredefinedCollections.arrayList);
    }
}
