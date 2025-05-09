package com.programmers.lvone;

import java.util.Arrays;

class Solution12917 {
    public String solution(String s) {
        char[] arr = s.toCharArray();

        String upstr = "";
        String lostr = "";

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 96)
                lostr += arr[i];
            else
                upstr += arr[i];
        }

        char[] uparr = upstr.toCharArray();
        char[] loarr = lostr.toCharArray();

        Arrays.sort(uparr);
        Arrays.sort(loarr);

        upstr = "";
        lostr = "";

        for(int i=uparr.length-1; i>=0; i--) upstr+=uparr[i];
        for(int i=loarr.length-1; i>=0; i--) lostr+=loarr[i];

        String answer = lostr+upstr;

        return answer;
    }
}
