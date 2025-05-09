package com.programmers.lvone;

class Solution12919 {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                sb.append(i).append("에 있다");
            }
        }

        return sb.toString();
    }
}
