package com.itschool.session19.homework.LinkedList;

import com.itschool.session19.homework.PredefinedCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Challenge5 {
    /*
        Write a Java program to insert the specified element at the specified position in the linked list.
     */
    public static void main(String[] args) {
        System.out.println("Initial list: " + PredefinedCollections.linkedList);
        addElementToLinkedList(1,4, PredefinedCollections.linkedList);
        System.out.println("After: " + PredefinedCollections.linkedList);
    }

    public static void addElementToLinkedList(int index,
                                              int element,
                                              LinkedList<Integer> linkedList
    ) {
        if (index > linkedList.size()) {
            System.out.println("Index out of range!");
            return;
        }

        linkedList.add(index, element);
    }
}
