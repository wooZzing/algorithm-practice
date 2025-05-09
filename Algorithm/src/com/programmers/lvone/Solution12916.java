package com.programmers.lvone;

class Solution12916 {
    boolean solution(String s) {
        boolean answer = true;
        int[] chk = new int[2];
        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p')
                chk[0]++;
            else if(s.charAt(i) == 'y')
                chk[1]++;
        }

        if(chk[0] != chk[1])
            answer = false;

        return answer;
    }
}
