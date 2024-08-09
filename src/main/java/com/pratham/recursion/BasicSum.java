package com.pratham.recursion;

public class BasicSum {
    private static int sum = 0;
    public static void main(String[] args) {
        int i = 0;
        add(i);
    }

    public static void add(int i) {
        System.out.println(i);
        sum+=i;
        if(i == 5) {
            System.out.println(sum);
            return;
        }
        else {
            add(++i);
        }
    }
}
