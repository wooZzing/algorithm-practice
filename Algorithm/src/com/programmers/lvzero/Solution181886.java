package com.programmers.lvzero;

public class Solution181886 {
    public String[] solution(String[] names) {
        String[] answer = new String[(int) Math.ceil((double) names.length / 5)];

        for(int i=0, j=0; i<names.length; i+=5, j++)
            answer[j] = names[i];

        return answer;
    }
}
