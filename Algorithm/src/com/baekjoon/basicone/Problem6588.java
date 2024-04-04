package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = 1_000_000;
        Boolean[] isPrimeArr = new Boolean[N+1];
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

        String input;
        while (!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input);
            boolean found = false;

            for (int a = 3; a <= n / 2; a += 2) {
                if (isPrimeArr[a] && isPrimeArr[n - a]) {
                    System.out.println(n + " = " + a + " + " + (n - a));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
