package com.baekjoon.basicone;

import java.io.*;
import java.util.*;


public class problem1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] numArr = new int[N];

        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        int num = 1;
        boolean check = true;

        for (int i = 0; i < N; i++) {
            int target = numArr[i];

            if (num <= target) {
                while (num <= target) {
                    stack.push(num++);
                    sb.append("+\n");
                }
            }

            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.print(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}