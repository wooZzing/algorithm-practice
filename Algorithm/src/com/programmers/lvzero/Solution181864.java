package com.programmers.lvzero;

public class Solution181864 {
    public int solution(String myString, String pat) {
        char[] arr = myString.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 'A') arr[i] = 'B';
            else arr[i] = 'A';
        }

        int answer = 0;
        if(new String(arr).indexOf(pat) > -1) answer = 1;
        else answer = 0;

        return answer;
    }
}
