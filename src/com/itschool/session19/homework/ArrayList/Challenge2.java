package com.itschool.session19.homework.ArrayList;

import com.itschool.session19.homework.PredefinedCollections;

public class Challenge2 {
    /*
        Write a Java program to iterate through all elements in an array list
     */
    public static void main(String[] args) {
        for (Integer el : PredefinedCollections.arrayList) {
            System.out.println(el);
        }
    }
}
