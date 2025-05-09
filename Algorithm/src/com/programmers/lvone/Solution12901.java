package com.programmers.lvone;

import java.util.HashSet;
import java.util.Set;

class Solution12901 {
    public String solution(int a, int b) {
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] nm = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

        int total = 0;
        for(int i=0; i<a-1; i++) {
            total += days[i];
        }

        total+=b;

        return nm[total%7];
    }
}
