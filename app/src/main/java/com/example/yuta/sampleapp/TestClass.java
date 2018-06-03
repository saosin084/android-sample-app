package com.example.yuta.sampleapp;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);

        for (int el : list) {
            System.out.println(el);
        }

//        for (int i = 0; i < test.length; i++) {
//
//            System.out.println("i=" + i + "Hello World");
//        }
    }
}
