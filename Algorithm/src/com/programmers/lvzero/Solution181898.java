package com.programmers.lvzero;

public class Solution181898 {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for(;idx<arr.length;idx++) {
            if(arr[idx]==1) {
                answer = idx;
                break;
            }
        }
        return answer;
    }
}
