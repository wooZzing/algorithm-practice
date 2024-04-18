package com.baekjoon.basicone;

import java.io.*;

public class Problem2745 {
    public static int conversionToDecimal(char[] num, int type){
        int decimal = 0;

        for (int i = 0; i < num.length; i++) {
            int value = Character.digit(num[i], type);
            decimal = decimal * type + value;
        }

        return decimal;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        char[] num = input[0].toCharArray();
        int type = Integer.parseInt(input[1]);

        System.out.println(conversionToDecimal(num, type));

        br.close();
    }
}