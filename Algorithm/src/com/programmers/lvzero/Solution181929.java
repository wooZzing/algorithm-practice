package com.programmers.lvzero;

public class Solution181929 {
    public int solution(int[] num_list) {
        int s = 0;
        int m = 1;

        for(int i=0; i<num_list.length; i++) {
            s += num_list[i];
            m *= num_list[i];
        }

        return m < s*s ? 1 : 0;
    }
}
