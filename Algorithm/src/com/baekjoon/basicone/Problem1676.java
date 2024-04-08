package com.baekjoon.basicone;

import java.util.Scanner;

public class Problem1676 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt = 0;

        for (int i = 5; i <= N; i *= 5) {
            cnt += N / i;
        }

        System.out.println(cnt);
    }
}