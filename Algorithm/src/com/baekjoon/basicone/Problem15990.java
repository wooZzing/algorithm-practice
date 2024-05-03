package com.baekjoon.basicone;

import java.io.*;

public class Problem15990 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int mod = 1_000_000_009;
        int max = 100_000;

        long[][] dp = new long[max + 1][4];

        dp[1][1] = dp[2][2] = dp[3][1] = dp[3][2] = dp[3][3] = 1;

        for(int i = 4; i <= max; i++){
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % mod;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % mod;
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % mod;
        }

        int count = Integer.parseInt(br.readLine());

        while(count > 0) {
            int num = Integer.parseInt(br.readLine());

            long result = (dp[num][1] + dp[num][2] + dp[num][3]) % mod;
            bw.write(result + "\n");

            count--;
        }

        bw.flush();
    }
}