package com.baekjoon.basicone;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Problem1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] inputArray = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(
                IntStream.of(inputArray)
                        .filter(num -> num > 1 && IntStream.rangeClosed(2, (int)Math.sqrt(num)).noneMatch(i -> num % i == 0))
                        .count()
        );
    }
}
