package com.itschool.session19.homework.LinkedList;

import com.itschool.session19.homework.PredefinedCollections;

public class Challenge3 {
    /*
        Write a Java program to iterate through all elements in a linked list starting at the specified position.
     */
    public static void main(String[] args) {
        System.out.println("Initial list: " + PredefinedCollections.linkedList);

        int index = 2;
        for (int i = 2; i < PredefinedCollections.linkedList.size(); i++) {
            System.out.print(PredefinedCollections.linkedList.get(i) + " ");
        }
    }
}
