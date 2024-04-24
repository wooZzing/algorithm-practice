package com.baekjoon.basicone;

import java.io.*;

public class Problem1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());

        int[] numArr = new int[inputNum+1];

        numArr[0] = -1;
        numArr[1] = 0;

        for(int i = 2; i <= inputNum; i++){
            numArr[i] = numArr[i - 1] + 1;
            if(i % 2 == 0) numArr[i] = Math.min(numArr[i / 2] + 1, numArr[i]);
            if(i % 3 == 0) numArr[i] = Math.min(numArr[i / 3] + 1, numArr[i]);
        }

        br.close();

        System.out.println(numArr[inputNum]);
    }
}