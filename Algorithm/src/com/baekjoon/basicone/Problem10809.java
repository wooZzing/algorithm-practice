package com.baekjoon.basicone;

import java.io.*;
import java.util.*;

public class Problem10809 {
    public static void main(String[] args) throws IOException {
        int[] alphabet = new int[26];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        Arrays.fill(alphabet, -1);

        for(int i = 0; i < input.length; i++){
            if(alphabet[input[i]-97] == -1)
                alphabet[input[i]-97] = i;
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