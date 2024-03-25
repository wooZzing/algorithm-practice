package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] originArr = new int[n];
        int[] cntArr = new int[1000001];
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            originArr[i] = Integer.parseInt(input[i]);
            cntArr[originArr[i]]++;
        }

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            while (!stack.isEmpty() && cntArr[originArr[i]] > cntArr[originArr[stack.peek()]]) {
                result[stack.pop()] = originArr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append(' ');
        }
        System.out.println(sb);
    }
}
