package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int inputNum = Integer.parseInt(br.readLine());
        boolean[] isPrimeArr = new boolean[inputNum+1];
        Arrays.fill(isPrimeArr, true);

        isPrimeArr[0] = false;
        isPrimeArr[1] = false;

        for(int i = 2; i * i <= inputNum; i++){
            if(isPrimeArr[i]){
                for(int j = i * i; j <= inputNum; j += i){
                    isPrimeArr[j] = false;
                }
            }
        }

        int start = 2;

        while(inputNum > 1){
            while (inputNum % start == 0 && isPrimeArr[start]) {
                sb.append(start).append("\n");
                inputNum /= start;
            }
            start++;
        }

        br.close();

        System.out.println(sb.toString().trim());
    }
}