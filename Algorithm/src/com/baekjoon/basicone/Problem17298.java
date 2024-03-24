package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){

            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        for(int i = 0; i < n; i++) {
            sb.append(result[i]);
            if(i < n-1) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}