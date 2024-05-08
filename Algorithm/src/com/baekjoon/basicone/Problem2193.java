package com.baekjoon.basicone;

import java.io.*;

public class Problem2193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());

        long[][] dp = new long[inputNum + 1][2];

        dp[1][1] = 1;

        for(int i = 2; i <= inputNum; i++){
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }

        long total = dp[inputNum][0] + dp[inputNum][1];

        System.out.println(total);

        br.close();
    }
}