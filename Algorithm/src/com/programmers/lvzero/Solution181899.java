package com.programmers.lvzero;

public class Solution181899 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];

        for(int i=0; start_num>=end_num; i++,start_num--)
            answer[i] = start_num;

        return answer;
    }
}
