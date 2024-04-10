package com.baekjoon.basicone;

import java.util.*;

public class Problem17087 {

    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int S = scanner.nextInt();

        int[] distances = new int[N];
        for (int i = 0; i < N; i++) {
            distances[i] = Math.abs(scanner.nextInt() - S);
        }

        int result = distances[0];
        for (int i = 1; i < N; i++) {
            result = gcd(result, distances[i]);
        }

        System.out.println(result);
        scanner.close();
    }
}
