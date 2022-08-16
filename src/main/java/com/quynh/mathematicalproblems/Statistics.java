package com.quynh.mathematicalproblems;

public class Statistics {
    public static void main(String[] args) {
        calcSumAndCountAllNumbersDivBy_2_Or_7(3); // 1 & 2
        calcSumAndCountAllNumbersDivBy_2_Or_7(8); // 4 & 19
        calcSumAndCountAllNumbersDivBy_2_Or_7(15); // 8 & 63

    }

    public static void calcSumAndCountAllNumbersDivBy_2_Or_7(int n) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 || i % 7 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("Number of natural numbers: " + count);
        System.out.println("Sum of natural numbers: " + sum);
    }
}
