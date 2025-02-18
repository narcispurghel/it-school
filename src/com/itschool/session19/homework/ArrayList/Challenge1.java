package com.itschool.session19.homework.ArrayList;

import java.util.ArrayList;

public class Challenge1 {
    /*
        Write a Java program to create a new array list, add some colors (string) and print out the collection.
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("purple");
        arrayList.add("red");
        arrayList.add("blue");

        System.out.println(arrayList);
    }
}
