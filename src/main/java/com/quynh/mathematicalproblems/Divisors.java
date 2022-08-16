package com.quynh.mathematicalproblems;


import java.util.ArrayList;
import java.util.List;

public class Divisors {
    public static void main(String[] args) {
        System.out.println(findProperDivisors(6));
    }

    public static List<Integer> findProperDivisors(final int value) {
        List<Integer> divisors = new ArrayList<Integer>();
        for (int i = 1; i <= value / 2; i++) {
            if (value % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

}
