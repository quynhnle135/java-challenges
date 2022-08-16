package com.quynh.mathematicalproblems;

public class BasicArithmetic {
    public static void main(String[] args) {
        System.out.println(calc(6, 7)); // 0
        System.out.println(calc(3, 4)); // 6
        System.out.println(calc(5, 5)); //5
    }
    public static int calc(int m, int n) {
        return (((m * n) / 2) % 7);
    }
}
