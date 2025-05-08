package com.basicMath;

public class LCMExample {

    // 기본 배수 나열 방식 (비효율적)
    public static int basicLCM(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }

    // 유클리드 호제법으로 GCD 구하기
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // GCD를 이용한 LCM 계산
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(basicLCM(12, 18));
        System.out.println(lcm(12, 18));
    }
}
