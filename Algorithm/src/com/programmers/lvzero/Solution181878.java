package com.programmers.lvzero;

public class Solution181878 {
    public int solution(String myString, String pat) {
        return myString.toUpperCase().indexOf(pat.toUpperCase()) > -1 ? 1 : 0;
    }
}
