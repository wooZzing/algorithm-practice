package com.programmers.lvzero;

public class Solution181931 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0; i<included.length; i++){
            if(included[i]) {
                answer+=a;
                a+=d;
            } else
                a+=d;
        }
        return answer;
    }
}
