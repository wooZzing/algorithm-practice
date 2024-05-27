package com.baekjoon.basicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int MOD = 10_007;

        if (N == 1) {
            System.out.println(10);
            return;
        }

        long[][] dp = new long[N][10];

        Arrays.fill(dp[0], 1);

        for(int i = 1; i < N; i++) {
            for(int j = 0; j < 10; j++){
                dp[i][j] = dp[i-1][j];
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i][j-1]) % MOD;
                }
            }
        }

        long sum = 0;
        for (int j = 0; j < 10; j++) {
            sum = (sum + dp[N-1][j]) % MOD;
        }

        System.out.println(sum);

        br.close();
    }
}