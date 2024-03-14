package com.baekjoon.basicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if(i != 0){
                sb.append('\n');
            }

            String input = br.readLine();
            String[] strArr = input.split(" ");

            for(int j = 0; j < strArr.length; j++){
                String str = strArr[j];

                if(j != 0){
                    sb.append(" ");
                }
                char[] chArr = str.toCharArray();

                int start = 0;
                int end = chArr.length;

                if(end > 1){
                    while(end > start){
                        char temp = chArr[end - 1];
                        chArr[end - 1] = chArr[start];
                        chArr[start] = temp;
                        start++;
                        end--;
                    }
                }

                sb.append(new String(chArr));
            }
        }
        System.out.print(sb.toString());
    }
}