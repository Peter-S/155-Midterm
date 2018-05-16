package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(digitMatch(38,34));
        System.out.println(digitMatch(5,5552));
        System.out.println(digitMatch(892,892));
        System.out.println(digitMatch(298892,7892));
        System.out.println(digitMatch(380,0));
        System.out.println(digitMatch(123456, 654321));
        System.out.println(digitMatch(1234567, 67));

    }

    public static int digitMatch(int n1, int n2) {
        if(n1 < 0 || n2 < 0)
            throw new IllegalArgumentException();

        if(n1 < 10 || n2 < 10) {
            return n1 % 10 == n2 % 10 ? 1 : 0;
        }

        else if(n1 % 10 == n2 % 10) {
            return 1 + digitMatch(n1/10, n2/10);
        }

        return digitMatch(n1/10, n2/10);
    }
}
