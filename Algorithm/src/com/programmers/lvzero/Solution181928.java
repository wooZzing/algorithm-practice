package com.programmers.lvzero;

public class Solution181928 {
    public int solution(int[] num_list) {
        String odd = "0";
        String even = "0";

        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2 == 0) even+=num_list[i];
            else odd+=num_list[i];
        }

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
