package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;

public class Challenge6 {
    /*
        Write a Java program to remove the third element from an array list.
     */
    public static void main(String[] args) {
        System.out.println(PredefinedCollections.arrayList);
        removeElementFromIndex(9, PredefinedCollections.arrayList);
        System.out.println(PredefinedCollections.arrayList);
    }

    public static void removeElementFromIndex(int index, ArrayList<Integer> arrayList
    ) {
        if (index > arrayList.size()) {
            System.out.println("Index out of range!");
            return;
        }

        arrayList.remove(index);
    }
}
