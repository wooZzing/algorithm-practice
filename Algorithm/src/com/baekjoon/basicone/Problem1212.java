package com.baekjoon.basicone;

import java.util.Scanner;
import java.math.BigInteger;

public class Problem1212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String octal = scanner.nextLine();
        scanner.close();

        BigInteger decimal = new BigInteger(octal, 8);

        String binary = decimal.toString(2);

        System.out.println(binary);
    }
}