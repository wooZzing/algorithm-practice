package com.baekjoon.basicone;

import java.io.*;

public class Problem2089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        if(num == 0){
            sb.append(0);
        }

        while(num != 0){
            int remainder = num % -2;
            num /= -2;

            if(remainder < 0){
                remainder += 2;
                num += 1;
            }

            sb.insert(0, remainder);
        }
        System.out.println(sb.toString());
    }
}