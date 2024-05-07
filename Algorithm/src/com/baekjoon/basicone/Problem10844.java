package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int mod = 1_000_000_000;
        int inputNum = Integer.parseInt(br.readLine());

        int[][] dp = new int[inputNum+1][10];

        for(int i = 1; i < dp[1].length; i++)
            dp[1][i] = 1;

        for(int i = 2; i <= inputNum; i++) {
            for(int j = 0; j <= 9; j++){
                if(j == 0) {
                    dp[i][j] = dp[i-1][1];
                    continue;
                }

                if(j == 9) {
                    dp[i][j] = dp[i-1][8];
                    continue;
                }

                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
            }
        }

        long total = Arrays.stream(dp[inputNum]).reduce(0, (acc, x) -> (acc + x) % mod);

        System.out.println(total);
    }
}