package com.baekjoon.basicone;

import java.io.*;

public class Problem11052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] numArr = new int[N + 1];
        int[] maxArr = new int[N + 1];
        numArr[0] = 0;

        String[] inputNum = br.readLine().split(" ");

        for(int i = 1; i <= N; i++){
            numArr[i] = Integer.parseInt(inputNum[i-1]);
        }

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                maxArr[i] = Math.max(maxArr[i], maxArr[i-j] + numArr[j]);
            }
        }

        System.out.println(maxArr[N]);

        br.close();
    }
}