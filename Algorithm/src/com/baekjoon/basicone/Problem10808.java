package com.baekjoon.basicone;

import java.io.*;
public class Problem10808 {
    public static void main(String[] args) throws IOException {
        int[] alphabet = new int[26];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        for(char c : input){
            alphabet[c-97]++;
        }

        for(int i = 0; i < alphabet.length; i++){
            if(i > 0)
                System.out.print(" " + alphabet[i]);
            else
                System.out.print(alphabet[i]);
        }
        System.out.println();
    }
}