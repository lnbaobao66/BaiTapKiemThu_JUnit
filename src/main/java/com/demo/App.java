package com.demo;

public class App {
    public int countEvenNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
