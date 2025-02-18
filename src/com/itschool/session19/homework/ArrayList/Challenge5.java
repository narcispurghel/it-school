package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;

public class Challenge5 {
    /*
        Write a Java program to update specific array element by given element.
     */
    public static void main(String[] args) {
        System.out.println(PredefinedCollections.arrayList.get(1));
        updateElementFromIndex(1, PredefinedCollections.arrayList, 9);
        System.out.println(PredefinedCollections.arrayList.get(1));
    }

    public static void updateElementFromIndex(int index,
                                              ArrayList<Integer> arrayList,
                                              int updatedValue
                                                 ) {
        if (index > arrayList.size()) {
            System.out.println("Index out of range!");
            return;
        }

        arrayList.set(index, updatedValue);
    }
}
