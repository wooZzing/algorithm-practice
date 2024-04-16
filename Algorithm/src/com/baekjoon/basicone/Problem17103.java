package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int N = 1_000_000;
        boolean[] isPrimeArr = new boolean[N+1];
        Arrays.fill(isPrimeArr, true);

        isPrimeArr[0] = false;
        isPrimeArr[1] = false;

        for(int i = 2; i * i <= N; i++){
            if(isPrimeArr[i]){
                for(int j = i * i; j <= N; j += i){
                    isPrimeArr[j] = false;
                }
            }
        }

        int loop = Integer.parseInt(br.readLine());

        while(loop > 0){
            int total = 0;

            int num = Integer.parseInt(br.readLine());

            if (num == 4) {
                total = 1; // 2 + 2의 유일한 케이스
            } else {
                for (int a = 3; a <= num / 2; a += 2) {
                    if (isPrimeArr[a] && isPrimeArr[num - a]) {
                        total++;
                    }
                }
            }

            loop--;

            bw.write(total + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}