package com.programmers.lvzero;

public class Solution181879 {
    public int solution(int[] num_list) {
        int k = num_list.length;
        int answer = k > 10 ? 0 : 1;
        for(int i=0; i<k; i++) {
            if(k > 10) answer += num_list[i];
            else answer *= num_list[i];
        }
        return answer;
    }
}
