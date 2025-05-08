package com.programmers.lvzero;

class Solution120896 {
    public String solution(String s) {
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1)
                answer.append((char) (i+'a'));
        }
        return answer.toString();
    }
}
