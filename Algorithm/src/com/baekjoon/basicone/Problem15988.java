package com.baekjoon.basicone;

import java.io.*;
import java.util.Arrays;

public class Problem15988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int MOD = 1_000_000_009;

        int N = Integer.parseInt(br.readLine());
        int[] out = new int[N];

        for(int i = 0; i < N; i++) {
            out[i] = Integer.parseInt(br.readLine());
        }

        int max = Arrays.stream(out).max().getAsInt();
        int[] dp = new int[max + 1];

        dp[0] = 1;
        if (max >= 1) dp[1] = 1;
        if (max >= 2) dp[2] = 2;
        if (max >= 3) dp[3] = 4;

        for(int i = 4; i <= max; i++) {
            dp[i] = ((dp[i - 1] + dp[i - 2]) % MOD + dp[i - 3]) % MOD;
        }

        for(int i = 0; i < N; i++){
            int result = dp[out[i]];

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}