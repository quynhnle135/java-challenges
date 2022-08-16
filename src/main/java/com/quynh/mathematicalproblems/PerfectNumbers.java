package com.quynh.mathematicalproblems;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println(calcPerfectNumbers(1000)); // 6, 28, 496
        System.out.println(perfectNumbers(1000));
        System.out.println(calcPerfectNumbers(10000)); // 6, 28, 496, 8128
        System.out.println(perfectNumbers(10000));
    }

    public static List<Integer> calcPerfectNumbers(int n) {
        List<Integer> perfectNumbers = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++) {
            if (divisorsSum(i) == i) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }

    public static int divisorsSum(int n) {
        List<Integer> divisors = new ArrayList<Integer>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        int sum = 0;
        for (int i : divisors) {
            sum += i;
        }
        return sum;
    }

    public static List<Integer> perfectNumbers(int n) {
        List<Integer> perfNum = new ArrayList<Integer>();
        for (int i = 1; i <= n / 2; i++) {
            List<Integer> divisors = new ArrayList<Integer>();
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    divisors.add(j);
                    sum += j;
                }
            }
            if (sum == i) {
                perfNum.add(i);
            }
        }
        return perfNum;
    }

}
