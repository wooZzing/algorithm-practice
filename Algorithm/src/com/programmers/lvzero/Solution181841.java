package com.programmers.lvzero;

public class Solution181841 {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i=0; i<str_list.length; i++) {
            if(str_list[i].indexOf(ex) == -1) answer+=str_list[i];
        }
        return answer;
    }
}
