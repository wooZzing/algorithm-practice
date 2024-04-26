package com.baekjoon.basicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11727 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());

        int[] numArr = new int[inputNum + 1];

        if(inputNum == 1){
            System.out.println(1);
            return;
        } else if(inputNum == 2) {
            System.out.println(3);
            return;
        }

        numArr[1] = 1;
        numArr[2] = 3;

        for(int i = 3; i <= inputNum; i++){
            numArr[i] = (numArr[i-1] + (2 * numArr[i-2])) % 10007;
        }

        System.out.println(numArr[inputNum]);

        br.close();
    }
}