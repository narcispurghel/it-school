package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge9 {
    /*
        Write a Java program to copy one array list into another.
     */
    public static void main(String[] args) {
        ArrayList<Integer> copy = copyElements(PredefinedCollections.arrayList);
        ArrayList<Integer> copy2 = new ArrayList<>(PredefinedCollections.arrayList);

        System.out.println(copy);
        System.out.println(copy2);
    }

    /*
        I don't understand why equals gives me true if I created a new Instance
        It seems that Java checks for size and elements
        I want to know how my copy ArrayList is stored in memory, if is a reference
        to
     */

    public static ArrayList<Integer> copyElements(ArrayList<Integer> array) {
        ArrayList<Integer> copy = new ArrayList<>();

        for (Integer element : array) {
            copy.add(element);
        }

        return copy;
    }
}
