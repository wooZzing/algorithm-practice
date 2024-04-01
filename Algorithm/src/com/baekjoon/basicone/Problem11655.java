package com.baekjoon.basicone;

import java.io.*;

public class Problem11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        for(int i = 0; i < input.length; i++){
            char c = input[i];

            if(c >= 'a' && c <= 'z')
                input[i] = (char) ((input[i]+13 > 122) ? input[i]-13 : input[i]+13);
            else if(c >= 'A' && c <= 'Z')
                input[i] = (char) ((input[i]+13 > 90) ? input[i]-13 : input[i]+13);
        }

        for(char c : input) {
            System.out.print(c);
        }
    }
}