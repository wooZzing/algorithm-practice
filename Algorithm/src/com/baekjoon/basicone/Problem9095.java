package com.baekjoon.basicone;

import java.io.*;

public class Problem9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] numArr = new int[12];

        numArr[1] = 1;
        numArr[2] = 2;
        numArr[3] = 4;

        for(int i = 4; i < numArr.length; i++){
            numArr[i] = numArr[i-1] + numArr[i-2] + numArr[i-3];
        }

        for(int i = 0; i < N; i++){
            int inputNum = Integer.parseInt(br.readLine());
            sb.append(numArr[inputNum]).append("\n");
        }

        System.out.println(sb.toString().trim());
        br.close();
    }
}