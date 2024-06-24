package com.baekjoon.basicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem13398 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        String[] input = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        int[] dp1 = new int[N];
        int[] dp2 = new int[N];

        dp1[0] = arr[0];
        dp2[0] = 0;

        int max = arr[0];

        for(int i = 1; i < N; i++){
            dp1[i] = Math.max(dp1[i-1] + arr[i], arr[i]);
            dp2[i] = Math.max(dp2[i-1] + arr[i], dp1[i-1]);
            max = Math.max(max, Math.max(dp1[i], dp2[i]));
        }

        System.out.println(max);

        br.close();
    }
}