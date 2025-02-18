package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;

public class Challenge4 {
    /*
         Write a Java program to retrieve an element (at a specified index) from a given array list.
     */
    public static void main(String[] args) {
        int element = getElementFromIndex(0, PredefinedCollections.arrayList);
        System.out.println(element);
    }

    public static Integer getElementFromIndex(int index, ArrayList<Integer> arrayList) {
        if (index > arrayList.size()) {
            System.out.println("Index out of range!");
            return -1;
        }

        return arrayList.get(index);
    }
}
