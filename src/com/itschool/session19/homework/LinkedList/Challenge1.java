package com.itschool.session19.homework.LinkedList;

import com.itschool.session19.homework.PredefinedCollections;

public class Challenge1 {
    /*
        Write a Java program to append the specified element to the end of a linked list. 
     */
    public static void main(String[] args) {
        System.out.println("Initial list: " + PredefinedCollections.linkedList);
        PredefinedCollections.linkedList.addLast(2);
        System.out.println("After addLast: " + PredefinedCollections.linkedList);
    }
}
