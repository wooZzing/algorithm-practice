package com.basicMath;

public class DivisorExample {
    public static void main(String[] args) {
        int number = 36;

        // 기본 방식: 1부터 number까지 전체 반복
        System.out.print(number + "의 약수 (전체 반복): ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();  // 줄 바꿈

        // 중복 약수 제거를 고려한 방식: 1부터 √number까지만 반복
        System.out.print(number + "의 약수 (중복 약수 처리): ");
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");  // 작은 약수 출력
                if (i != number / i) {
                    System.out.print((number / i) + " ");  // 큰 약수 출력 (중복 방지)
                }
            }
        }
    }
}