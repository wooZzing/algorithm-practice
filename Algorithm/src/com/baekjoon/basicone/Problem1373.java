package com.baekjoon.basicone;

import java.util.*;

public class Problem1373 {
    public static String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    public static String binaryToOctal(String binary) {
        StringBuilder octal = new StringBuilder();
        int binaryLength = binary.length();

        int padding = 3 - (binaryLength % 3);
        if (padding != 3) {
            binary = repeat("0", padding) + binary;
            binaryLength = binary.length();
        }

        for (int i = 0; i < binaryLength; i += 3) {
            int part = Integer.parseInt(binary.substring(i, i + 3), 2);
            octal.append(part);
        }

        return octal.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.next();
        System.out.println(binaryToOctal(binary));
        scanner.close();
    }
}