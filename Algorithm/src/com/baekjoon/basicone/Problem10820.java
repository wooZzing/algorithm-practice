package com.baekjoon.basicone;

import java.io.*;

public class Problem10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int[] counts = new int[4];

            for (char c : line.toCharArray()) {
                if (c >= 'a' && c <= 'z') counts[0]++;
                else if (c >= 'A' && c <= 'Z') counts[1]++;
                else if (c >= '0' && c <= '9') counts[2]++;
                else if (c == ' ') counts[3]++;
            }

            System.out.println(counts[0] + " " + counts[1] + " " + counts[2] + " " + counts[3]);
        }

        br.close();
    }
}