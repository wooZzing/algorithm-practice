package com.programmers.lvzero;

public class Solution181855 {
    public int solution(String[] strArr) {
        int[] arr = new int[100_000];
        int answer = 0;

        for(int i=0; i<strArr.length; i++) arr[strArr[i].length()-1]++;
        for(int i=0; i<arr.length; i++) {
            if(answer < arr[i]) answer = arr[i];
        }
        return answer;
    }
}
