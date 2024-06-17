package com.baekjoon.basicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        int[][] dp = new int[N][N];

        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");

            for(int j = 0; j < input.length; j++){
                arr[i][j] = Integer.parseInt(input[j]);

                if(i == N-1){
                    dp[i][j] = arr[i][j];
                }
            }
        }

        if(N == 1){
            System.out.println(arr[0][0]);
            return;
        }

        for(int n = N-2; n >= 0; n--){
            for(int i = 0; i < n+1; i++) {
                dp[n][i] = Math.max(dp[n+1][i], dp[n+1][i+1]) + arr[n][i];
            }
        }

        System.out.println(dp[0][0]);

        br.close();
    }
}