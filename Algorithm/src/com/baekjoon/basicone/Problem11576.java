package com.baekjoon.basicone;

import java.io.*;

public class Problem11576 {
    public static String conversion(int num[], int originType, int conversionType){
        StringBuilder str = new StringBuilder();

        int decimal = 0;
        for (int i = 0; i < num.length; i++) {
            decimal = decimal * originType + num[i];
        }

        if (decimal == 0) {
            return "0";
        }

        while(decimal > 0){
            str.insert(0, (decimal % conversionType) + " ");
            decimal /= conversionType;
        }

        return str.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] type = br.readLine().split(" ");
        int originType = Integer.parseInt(type[0]);
        int conversionType = Integer.parseInt(type[1]);

        br.readLine();

        String[] num = br.readLine().split(" ");
        int[] target = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            target[i] = Integer.parseInt(num[i]);
        }

        System.out.println(conversion(target, originType, conversionType));

        br.close();
    }
}