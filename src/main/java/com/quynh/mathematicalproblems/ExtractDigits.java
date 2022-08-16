package com.quynh.mathematicalproblems;

public class ExtractDigits {
    public static void main(String[] args) {
        extractDigits(123);
        extractDigits(1230);
    }
    public static void extractDigits(final int startValue) {
        int remainingValue = startValue;
        while (remainingValue > 0) {
            final int digit = remainingValue % 10;
            System.out.print(digit + " ");

            remainingValue = remainingValue / 10;
        }
        System.out.println();
    }
}
