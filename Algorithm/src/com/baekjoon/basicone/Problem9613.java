package com.baekjoon.basicone;

import java.io.*;

public class Problem9613 {

    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            long sum = 0;
            String[] input = br.readLine().split(" ");

            int numbersCount = Integer.parseInt(input[0]);
            int[] numbers = new int[numbersCount];

            for(int j = 0; j < numbersCount; j++){
                numbers[j] = Integer.parseInt(input[j + 1]);
            }

            for(int j = 0; j < numbersCount - 1; j++){
                for(int p = j + 1; p < numbersCount; p++){
                    sum += gcd(numbers[j], numbers[p]);
                }
            }

            System.out.println(sum);
        }
    }
}
