package com.baekjoon.basicone;

import java.io.*;

public class Problem16194 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] numArr = new int[N + 1];
        int[] minArr = new int[N + 1];

        String[] inputNum = br.readLine().split(" ");

        for(int i = 1; i <= N; i++) {
            numArr[i] = Integer.parseInt(inputNum[i-1]);
            minArr[i] = numArr[i];
        }

        for(int i = 2; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                minArr[i] = Math.min(minArr[i], minArr[i-j] + numArr[j]);
            }
        }

        System.out.println(minArr[N]);

        br.close();
    }
}