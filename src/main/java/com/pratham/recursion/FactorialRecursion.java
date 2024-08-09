package com.pratham.recursion;

public class FactorialRecursion {
    public static void main(String[] args) {
        int key = 5;
        System.out.println(factorial(key));
    }

    public static int factorial(int i) {
        if(i ==1) {
            return 1;
        }
        return i * factorial(i-1);
    }
}
