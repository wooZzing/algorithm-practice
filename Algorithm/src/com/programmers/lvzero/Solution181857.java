package com.programmers.lvzero;

public class Solution181857 {
    public int[] solution(int[] arr) {
        int k=1;
        while(k<arr.length) k*=2;

        int[] answer = new int[k];
        for(int i=0; i<arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}
