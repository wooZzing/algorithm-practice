package com.baekjoon.basicone;

import java.io.*;

public class Problem10872 {

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        System.out.println(factorial(input));
    }
}