package com.basicMath;

public class MultipleExample {
    public static void main(String[] args) {
        int number = 3;

        System.out.print(number + "의 배수: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((number * i) + " ");
        }
    }
}