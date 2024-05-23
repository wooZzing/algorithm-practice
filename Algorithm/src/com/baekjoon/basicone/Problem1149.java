package com.baekjoon.basicone;

import java.io.*;

public class Problem1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] out = new int[N][3];

        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            for(int j = 0; j < str.length; j++){
                out[i][j] = Integer.parseInt(str[j]);
            }
        }

        int[][] dp = new int[N][3];
        dp[0][0] = out[0][0];
        dp[0][1] = out[0][1];
        dp[0][2] = out[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + out[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + out[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + out[i][2];
        }

        int min = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
        System.out.println(min);

        br.close();
    }
}