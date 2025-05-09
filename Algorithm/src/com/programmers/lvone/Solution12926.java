package com.programmers.lvone;

class Solution12926 {
    public String solution(String s, int n) {
        char[] larr = new char[26];
        char[] uarr = new char[26];

        for(int i=0; i<26; i++) {
            larr[i] = (char) (i + 'a');
            uarr[i] = (char) (i + 'A');
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' ') {
                sb.append(" ");
            } else if (c < 'a') {
                int inx = c - 'A' + n;
                sb.append(uarr[inx%26]);
            } else {
                int inx = c - 'a' + n;
                sb.append(larr[inx%26]);
            }
        }
        return sb.toString();
    }
}
