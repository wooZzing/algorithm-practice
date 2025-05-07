package com.programmers.lvzero;

public class Solution181900 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] arr = my_string.toCharArray();

        for(int i=0; i<indices.length; i++) {
            arr[indices[i]] = ' ';
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != ' ') answer+=arr[i];
        }
        return answer;
    }
}
