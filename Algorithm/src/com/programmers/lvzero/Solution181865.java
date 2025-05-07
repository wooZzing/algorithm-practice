package com.programmers.lvzero;

public class Solution181865 {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);

        int answer = 0;
        if(arr[1].equals("+")) answer = a+b;
        else if(arr[1].equals("-")) answer = a-b;
        else answer = a*b;

        return answer;
    }
}
