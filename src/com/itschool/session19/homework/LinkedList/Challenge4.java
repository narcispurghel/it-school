package com.itschool.session19.homework.LinkedList;

import com.itschool.session19.homework.PredefinedCollections;

public class Challenge4 {
    /*
        Write a Java program to iterate a linked list in reverse order.
     */
    public static void main(String[] args) {
        System.out.println("Initial list: " + PredefinedCollections.linkedList);

        System.out.print("Reversed list: ");
        for (int i = PredefinedCollections.linkedList.size() - 1; i >= 0; --i) {
            System.out.print(PredefinedCollections.linkedList.get(i) + " ");
        }
    }
}
