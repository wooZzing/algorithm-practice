package com.baekjoon.basicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int MOD = 1_000_000_000;

        int[] dp = new int[N + 1];

        Arrays.fill(dp,1);

        for (int k = 2; k <= K; k++) {
            for (int n = 1; n <= N; n++) {
                dp[n] = (dp[n] + dp[n - 1]) % MOD;
            }
        }

        System.out.println(dp[N]);
    }
}