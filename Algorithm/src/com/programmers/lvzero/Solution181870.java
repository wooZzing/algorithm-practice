package com.programmers.lvzero;

public class Solution181870 {
    public String[] solution(String[] strArr) {
        int cnt = 0;
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].indexOf("ad") > -1)
                continue;
            else
                cnt++;
        }

        String[] answer = new String[cnt];

        for(int i=0, j=0; i<strArr.length; i++) {
            if(strArr[i].indexOf("ad") > -1)
                continue;
            else {
                answer[j] = strArr[i];
                j++;
            }
        }

        return answer;
    }
}
