package com.programmers.lvzero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution181945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();

        for(int i=0; i<a.length(); i++)
            sb.append(a.charAt(i)).append("\n");

        System.out.println(sb);
    }
}
