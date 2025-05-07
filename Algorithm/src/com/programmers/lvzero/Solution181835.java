package com.programmers.lvzero;

public class Solution181835 {
    public int[] solution(int[] arr, int k) {
        for(int i=0; i<arr.length; i++) {
            if(k%2 != 0) arr[i] *= k;
            else arr[i] += k;
        }
        return arr;
    }
}
