package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge15 {
    /*
        Write a Java program to join two array lists.
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayToJoin = new ArrayList<>();
        arrayToJoin.add(77);
        arrayToJoin.add(88);

        System.out.println(joinArrayLists(arrayToJoin, PredefinedCollections.arrayList));
    }

    public static ArrayList<Integer> joinArrayLists(ArrayList<Integer> first,
                                                    ArrayList<Integer>  second) {
        ArrayList<Integer> joined = new ArrayList<>();
        joined.addAll(first);
        joined.addAll(second);

        return joined;
    }
}
