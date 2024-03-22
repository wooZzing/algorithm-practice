package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem17413 {
    public static void main(String[] args) throws IOException {
        Deque<Character> stack = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        boolean flag = false;

        for (char c : input.toCharArray()) {
            if(c == '<') {
                flag = true;
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
            else if(c == '>') {
                sb.append(c);
                flag = false;
                continue;
            }
            else if(c == ' ') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
                continue;
            }

            if(flag){
                sb.append(c);
            } else {
                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.append(' ');

        System.out.println(sb.toString());
    }
}