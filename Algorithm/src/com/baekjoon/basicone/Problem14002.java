package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem14002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        int[] prev = new int[n];

        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
            prev[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
        }

        int max = 0;
        int inx = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > max) {
                max = dp[i];
                inx = i;
            }
        }

        Deque<Integer> dq = new ArrayDeque<>();

        while (inx != -1) {
            dq.push(arr[inx]);
            inx = prev[inx];
        }

        bw.write(max + "\n");

        while (!dq.isEmpty()) {
            bw.write(dq.pop() + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}