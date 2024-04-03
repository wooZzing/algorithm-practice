package com.baekjoon.basicone;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Problem1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] inputArray = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        IntStream.rangeClosed(inputArray[0], inputArray[1])
                .filter(num -> num > 1 && IntStream.rangeClosed(2, (int)Math.sqrt(num)).noneMatch(i -> num % i == 0))
                .forEach(System.out::println);
    }
}
