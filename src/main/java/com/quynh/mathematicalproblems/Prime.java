package com.quynh.mathematicalproblems;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i < 25; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        System.out.println("Primes < 25: " + primes);
    }

    public static boolean isPrime(final int potentiallyPrime) {
        // Check for all relevant numbers if they represent a divisor
        for (int i = 2; i <= potentiallyPrime / 2; i++) {
            if (potentiallyPrime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
