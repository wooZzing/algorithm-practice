package com.baekjoon.basicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if(i != 0)
                sb.append('\n');

            int check = 0;

            String input = br.readLine();
            char[] chArr = input.toCharArray();

            for(int j = 0; j < chArr.length; j++){
                char ch = chArr[j];

                if(ch == '(')
                    check++;
                else
                    check--;

                if(check == -1)
                    break;

            }

            if(check == 0)
                sb.append("YES");
            else
                sb.append("NO");
        }
        System.out.print(sb.toString());
    }
}