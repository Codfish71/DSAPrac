package com.pratham.recursion;

public class ReverseIterationBasic {
    private static int sum= 0;
    public static void main(String[] args) {
        int i = 5;
        add(i);
    }

    public static void add(int i){
        sum+=i;
        if(i == 0) {
            System.out.println("Final sum: " + sum);
            return;
        }
        add(--i);
    }


}
