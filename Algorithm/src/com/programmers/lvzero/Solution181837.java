package com.programmers.lvzero;

public class Solution181837 {
    public int solution(String[] order) {
        int answer = 0;
        for(int i=0; i<order.length; i++) {
            if(order[i].equals("anything"))
                answer += 4500;
            else if(order[i].indexOf("americano") > -1)
                answer += 4500;
            else
                answer += 5000;
        }
        return answer;
    }
}
