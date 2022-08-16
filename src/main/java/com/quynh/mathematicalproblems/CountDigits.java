package com.quynh.mathematicalproblems;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(123));
        System.out.println(countDigits(44444));
        System.out.println(countDigits(2));
    }
     public static int countDigits(final int number) {
        int count = 0;

        int remainingValue = number;
        while (remainingValue > 0) {
            remainingValue = remainingValue / 10;
            count++;
        }
        return  count;
     }
}
