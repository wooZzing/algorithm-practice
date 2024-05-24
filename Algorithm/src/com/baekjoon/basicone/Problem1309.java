package com.baekjoon.basicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int MOD = 9901;

        if (N == 1) {
            System.out.println(3);
            return;
        }

        long[][] dp = new long[N][3];

        dp[0][0] = 1;
        dp[0][1] = 1;
        dp[0][2] = 1;


        for(int i = 1; i < N; i++) {
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % MOD;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % MOD;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % MOD;
        }

        long sum = (dp[N-1][0] + dp[N-1][1] + dp[N-1][2]) % MOD;

        System.out.println(sum);

        br.close();
    }
}