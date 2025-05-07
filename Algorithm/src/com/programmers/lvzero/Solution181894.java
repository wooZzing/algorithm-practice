package com.programmers.lvzero;

public class Solution181894 {
    public int[] solution(int[] arr) {
        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                if(s > i) s=i;
                if(e < i) e=i;
            }
        }

        int[] answer = e+s==-1 ? new int[]{-1} : new int[e-s+1];

        int i=0;
        while(s<=e) {
            answer[i] = arr[s];
            i++;
            s++;
        }

        return answer;
    }
}
