package com.baekjoon.basicone;

import java.io.*;

public class Problem10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        long a = Long.parseLong(input[0]+input[1]);
        long b = Long.parseLong(input[2]+input[3]);

        System.out.println(a+b);
    }
}