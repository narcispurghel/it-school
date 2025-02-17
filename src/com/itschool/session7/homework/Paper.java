package com.itschool.session7.homework;

import java.util.ArrayList;

public class Paper {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] output = new int[nums.length];
        System.out.println(output);

        ArrayList<Integer> paper = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            if(nums[i] == 2) {
                paper.add();
            } else {
                paper.add(nums[i]);
            }
        }

        paper.toArray();
    }
}
