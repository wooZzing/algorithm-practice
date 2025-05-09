package com.programmers.lvone;

class Solution12930 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int inx = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' ') {
                sb.append(c);
                inx = 0;
                continue;
            }
            else if(inx % 2 == 0) {
                sb.append(Character.toUpperCase(c));
            }
            else {
                sb.append(Character.toLowerCase(c));
            }

            inx++;
        }

        return sb.toString();
    }
}
