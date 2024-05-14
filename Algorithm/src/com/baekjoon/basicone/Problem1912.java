package com.baekjoon.basicone;

import java.io.*;

public class Problem1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];

        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(temp[i]);
        }

        int current = numArr[0];
        int max = numArr[0];

        for (int i = 1; i < n; i++){
            current = Math.max(numArr[i], current + numArr[i]);
            max = Math.max(max, current);
        }

        System.out.println(max);

        br.close();
    }
}