package com.basicMath;

public class GCDExample {

    // 기본 약수 검사 방식
    public static int basicGCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // 유클리드 호제법 – 재귀 버전
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 유클리드 호제법 – 반복문 버전
    public static int gcdIter(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(basicGCD(12, 18));
        System.out.println(gcd(12, 18));
        System.out.println(gcdIter(12, 18));
    }
}
