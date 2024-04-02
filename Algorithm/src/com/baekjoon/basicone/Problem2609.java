package com.baekjoon.basicone;

import java.io.IOException;
import java.util.Scanner;

public class Problem2609 {

    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(gcd(A,B));
        System.out.println(lcm(A,B));

        scanner.close();
    }
}
