package com.programmers.lvzero;

public class Solution181902 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++) {
            int inx = my_string.charAt(i)-'A';
            if(inx < 26)  answer[inx]++;
            else        answer[inx-6]++;
        }
        return answer;
    }
}
