package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge12 {
    /*
        Write a Java program to extract a portion of an array list.
     */
    public static void main(String[] args) {
        System.out.println(PredefinedCollections.arrayList);

        int startIndex = 0;
        int stopIndex = 3;

        System.out.println(extractPortionFromArrayList(startIndex, stopIndex, PredefinedCollections.arrayList));
    }

    public static ArrayList<Integer> extractPortionFromArrayList(int start,
                                                      int stop,
                                                      ArrayList<Integer> arrayList) {
        ArrayList<Integer> result = new ArrayList<>();

        if (start < 0 || stop < 0) {
            System.out.println("Indexes are not valid!");
            return null;
        }

        if (start > arrayList.size() || stop > arrayList.size()) {
            System.out.println("Indexes are out of bound!");
            return null;
        }

        for (int i = start; i <= stop; ++i) {
            result.add(arrayList.get(i));
        }

        return result;
    }
}
