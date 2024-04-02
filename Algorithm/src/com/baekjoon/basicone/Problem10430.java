package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem10430 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int modA = A % C;
        int modB = B % C;

        System.out.println((A + B) % C);

        System.out.println((modA + modB) % C);

        System.out.println((A * B) % C);

        System.out.println((modA * modB) % C);

        scanner.close();
    }
}