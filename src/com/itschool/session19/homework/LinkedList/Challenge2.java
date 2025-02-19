package com.itschool.session19.homework.LinkedList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.Iterator;

public class Challenge2 {
    /*
        Write a Java program to iterate through all elements in a linked list.
     */
    public static void main(String[] args) {
        for (Integer integer : PredefinedCollections.linkedList) {
            System.out.print(integer + " ");
        }
    }
}
