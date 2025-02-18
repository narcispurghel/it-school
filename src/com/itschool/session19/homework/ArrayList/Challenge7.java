package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;

public class Challenge7 {
    /*
        Write a Java program to search an element in an array list.
     */
    public static void main(String[] args) {
        boolean elementExists = searchElementInArrayList(2, PredefinedCollections.arrayList);
        System.out.println(elementExists);
    }

    public static boolean searchElementInArrayList(int element, ArrayList<Integer> arrayList) {
        for (Integer value : arrayList) {
            if (value == element) {
                return true;
            }
        }

        return false;
    }
}
