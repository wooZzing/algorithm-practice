package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem10799 {
    public static void main(String[] args) throws IOException {
        Deque<Character> stack = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
                if (input.charAt(i - 1) == '(') {
                    total += stack.size();
                } else {
                    total += 1;
                }
            }
        }

        System.out.println(total);
    }
}