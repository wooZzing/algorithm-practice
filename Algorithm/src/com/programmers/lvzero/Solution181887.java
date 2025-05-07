package com.programmers.lvzero;

public class Solution181887 {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for(int i=0; i<num_list.length; i++) {
            if(i%2==0) even+=num_list[i];
            if(i%2!=0) odd+=num_list[i];
        }

        int answer = even>odd ? even : odd;
        return answer;
    }
}
