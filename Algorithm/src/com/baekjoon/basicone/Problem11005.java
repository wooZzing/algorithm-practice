package com.baekjoon.basicone;

import java.io.*;

public class Problem11005 {
    public static String conversionFromDecimal(int num, int type){
        StringBuilder str = new StringBuilder();

        while(num > 0){

            int remainder = num % type;

            if(remainder >= 10)
                str.append((char) (remainder - 10 + 'A'));
            else
                str.append((char) (remainder + '0'));

            num /= type;
        }

        return str.reverse().toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int num = Integer.parseInt(input[0]);
        int type = Integer.parseInt(input[1]);

        System.out.println(conversionFromDecimal(num, type));

        br.close();
    }
}
