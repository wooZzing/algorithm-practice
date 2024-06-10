package com.baekjoon.basicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int n = 0; n < N; n++){
            int count = Integer.parseInt(br.readLine());
            int[][] stiker = new int[2][count];
            int[][] dp = new int[2][count];

            for (int i = 0; i < 2; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < count; j++) {
                    stiker[i][j] = Integer.parseInt(input[j]);
                }
            }

            dp[0][0] = stiker[0][0];
            dp[1][0] = stiker[1][0];
            if (count > 1) {
                dp[0][1] = dp[1][0] + stiker[0][1];
                dp[1][1] = dp[0][0] + stiker[1][1];
            }

            for (int i = 2; i < count; i++) {
                dp[0][i] = Math.max(dp[1][i - 1] + stiker[0][i], dp[1][i - 2] + stiker[0][i]);
                dp[1][i] = Math.max(dp[0][i - 1] + stiker[1][i], dp[0][i - 2] + stiker[1][i]);
            }

            System.out.println(Math.max(dp[0][count - 1], dp[1][count - 1]));
        }

        br.close();
    }
}