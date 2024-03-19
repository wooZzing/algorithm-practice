package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class problem1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }

        sb.append('<');
        while(!q.isEmpty()) {
            for(int i = 1; i < K; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll());
            if(!q.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append('>');

        System.out.println(sb.toString());
    }
}