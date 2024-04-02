package com.baekjoon.basicone;

import java.io.*;
import java.util.stream.*;

public class Problem11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        IntStream.range(0, input.length())
                .mapToObj(i -> input.substring(i))
                .sorted()
                .forEach(System.out::println);
    }
}