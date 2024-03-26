package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[] input = br.readLine().toCharArray();

        double[] numArr = new double[n];

        for(int i = 0; i < n; i++){
            numArr[i] = Double.parseDouble(br.readLine());
        }

        Deque<Double> stack = new ArrayDeque<>();

        for(char c : input){
            switch (c){
                case '+' :
                    double p2 = stack.pop();
                    double p1 = stack.pop();

                    stack.push(p1 + p2);
                    break;
                case '-' :
                    p2 = stack.pop();
                    p1 = stack.pop();

                    stack.push(p1 - p2);
                    break;
                case '*' :
                    p2 = stack.pop();
                    p1 = stack.pop();

                    stack.push(p1 * p2);
                    break;
                case '/' :
                    p2 = stack.pop();
                    p1 = stack.pop();

                    stack.push(p1 / p2);
                    break;
                case '%' :
                    p2 = stack.pop();
                    p1 = stack.pop();

                    stack.push(p1 % p2);
                    break;
                default:
                    stack.push(numArr[c - 'A']);
            }
        }

        System.out.printf("%.2f", stack.pop());
    }
}