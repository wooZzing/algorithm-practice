package com.programmers.lvzero;

public class Solution181936 {
    public int solution(int number, int n, int m) {
        return number%n == 0 && number%m == 0 ? 1 : 0;
    }
}
