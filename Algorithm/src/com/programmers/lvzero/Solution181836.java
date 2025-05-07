package com.programmers.lvzero;

public class Solution181836 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];

        for(int i=0; i<answer.length; i++) {
            String str = picture[i/k];
            String con = "";
            for(int j=0, m=1; j<str.length(); m++) {
                con += str.charAt(j);
                if(m == k) {
                    j++;
                    m=0;
                }
            }

            answer[i] = con;

        }
        return answer;
    }
}
