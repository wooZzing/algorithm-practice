package com.programmers.lvzero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution181944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str = "";

        if(n % 2 == 0)
            str = "even";
        else
            str = "odd";

        System.out.println(n + " is " + str);
    }
}
